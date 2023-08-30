package Ch20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class C05GUI extends JFrame implements ActionListener, KeyListener{
	JButton b1;
	JButton b2;
	JTextField t1;
	JTextField t2;
	JTextArea a1;
	JScrollPane s1;
	
	C05GUI(){
		super("프레임창입니다.");
		setBounds(100,100,500,500);
		
		//Panel
		JPanel p = new JPanel();
		p.setLayout(null);
		
		//Btn_Component
		b1 = new JButton("버튼1");
		b1.setBounds(10,10,100,30);
		b2 = new JButton("버튼2");
		b2.setBounds(120,10,100,30);
		
		//Txt_Component
		t1 = new JTextField();
		t1.setBounds(10,50,100,30);
		t2 = new JTextField();
		t2.setBounds(120,50,100,30);
		
		//TxtArea_Component
		a1 = new JTextArea();
		a1.setBounds(10,90,210,300);
		a1.setEditable(false);
		
		//ScrollPan_component
		s1 = new JScrollPane();
		s1.setBounds(10,90,210,300);
		
		//Event처리
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addKeyListener(this);
		
		
		
		//Add_Panel_Component
		p.add(b1);
		p.add(b2);
		p.add(t1);
		p.add(t2);
//		p.add(a1);
		p.add(s1);
		
		add(p);
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==t1) {
			if(e.getKeyCode()==10) {
				System.out.println("t1's Enter");
				String str = t1.getText();
				a1.append(str+"\n");
				t1.setText("");
			}
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			System.out.println("버튼1 클릭!");
		}else if(e.getSource()==b2) {
			System.out.println("버튼2 클릭!");
		}
	}
}

public class C05SwingMain {

	public static void main(String[] args) {

		new C05GUI();
	}

}
