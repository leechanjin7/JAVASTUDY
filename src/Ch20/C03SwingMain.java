package Ch20;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	
	C03GUI(){
		super("두번째 프레임창입니다.");
		setBounds(100,100,500,500);
		
		JPanel panel = new JPanel();
		
		//배경색지정
		Color color = new Color(71,199,109); //rgb색상
		panel.setBackground(color);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}

public class C03SwingMain {
	
	public static void main(String[] args) {
		new C03GUI();
	}


}
