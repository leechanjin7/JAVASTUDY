package Ch20;

import javax.swing.JFrame;

public class C01SwingMain {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("첫번째 프레임창입니다.");
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
