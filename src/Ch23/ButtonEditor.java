package Ch23;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

	private JButton b;
	
	public ButtonEditor() {
		b = new JButton("버튼");
		b.setOpaque(true);
		b.addActionListener(this);
		
	}

	@Override
	public Object getCellEditorValue() {
		
		return b;
	}



	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		if(value instanceof Component) {
			return (Component) value;
		}else {
			b.setText((value == null) ? "" : "버튼");
			return b;
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼 클릭시 동작 작성
		System.out.println("Button clicked!!");
		JFrame f = new JFrame();
		f.setBounds(10,10,100,100);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);

	}

	public static void main(String[] args) {

	}
}
