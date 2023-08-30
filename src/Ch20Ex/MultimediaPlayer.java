package Ch20Ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import javazoom.jl.player.Player;



public class MultimediaPlayer extends JFrame implements ActionListener{
	
	private JButton playb;
	private JButton pauseb;
	private JButton stopb;
	private Clip audioc;
	private JLabel albumCoverLabel;
	
	private final String mp3FileToPlay;
	private Player jlPlayer;
	
	
	public MultimediaPlayer(String mp3FileToPlay){
		
		this.mp3FileToPlay = mp3FileToPlay;
		
		setTitle("Multimedia Player");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//Play Button
		playb = new JButton("Play");
		playb.addActionListener(this);
		
		//Pause Button
		pauseb = new JButton("Pause");
		pauseb.addActionListener(this);
		
		//Stop Button
		stopb = new JButton("Stop");
		stopb.addActionListener(this);
		
		//Album Cover Label
		albumCoverLabel = new JLabel();
		
		
		
		try {
			BufferedImage albumCoverImage = ImageIO.read(new File("C:\\임베디드웹\\JAVASTUDY\\src\\Ch20Ex\\물론.jpg"));
			albumCoverLabel.setIcon(new ImageIcon(albumCoverImage));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//Add components to the frame
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(playb);
		getContentPane().add(pauseb);
		getContentPane().add(stopb);
		getContentPane().add(albumCoverLabel);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == playb) {
			playAudio(null);
		}else if(e.getSource() == pauseb) {
			
		}else if(e.getSource() == stopb) {
			jlPlayer.close();
		}
	}



	private void playAudio(String audioFilePath) {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\임베디드웹\\JAVASTUDY\\src\\Ch20Ex\\물론.mp3");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			jlPlayer = new Player(bufferedInputStream);
		}catch(Exception e) {
			System.out.println("Problem playing mp3 file : " + mp3FileToPlay);
			System.out.println(e.getMessage());
		}
		
		new Thread() {
			public void run() {
				try {
					jlPlayer.play();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}.start();
	}
	
	private void pauseAudio() {
		if(audioc != null && audioc.isRunning()) {
			audioc.stop();
		}
	}
	private void stopAudio() {
		if(audioc != null && audioc.isRunning()) {
			audioc.stop();
			audioc.setFramePosition(0);
		}
	}
	private void close() {
		if(jlPlayer != null) jlPlayer.close();
	}

	public static void main(String[] args) throws Exception{
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MultimediaPlayer(null).setVisible(true);
			}
		});
	}
}
