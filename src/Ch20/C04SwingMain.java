package Ch20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{

	C04GUI(){
		//Frame
		super("프레임창입니다");
		setBounds(100,100,700,700);
		
		//Panel
		JPanel p = new JPanel();
		p.setLayout(null);
		
		//Btn_Component
		JButton b1 = new JButton("Button1");
		b1.setBounds(10,10,100,30);
		JButton b2 = new JButton("Button2");
		b2.setBounds(120,10,100,30);
		
		//Txt_Component
		JTextField t1 = new JTextField();
		t1.setBounds(10,50,100,30);
		JTextField t2 = new JTextField();
		t2.setBounds(120,50,100,30);
		
		//TxtArea_Component
		JTextArea a1 = new JTextArea();
		a1.setBounds(10,90,210,300);
		
		//ScrollPan_Component
		JScrollPane s1 = new JScrollPane(a1);
		s1.setBounds(10,90,210,300);
		
		//Add_Panel_Component
		p.add(b1);
		p.add(b2);
		p.add(t1);
		p.add(t2);
//		p.add(a1);				//Area영역을 지워줘야 Scroll이 나타나짐
		p.add(s1);
		
		
		
		//위의 내용들 최종 추가하는 코드
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C04SwingMain {
	
	public static void main(String[] args) {
		
		new C04GUI();
		
	}

}
