package excise08.selfedu;

import java.awt.*;

import javax.swing.*;

public class J_Button extends JFrame{
	public J_Button(){
		super("Button Example");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		int i;
		ImageIcon [] ic = {
				new ImageIcon("img/img1.gif"),
				new ImageIcon("img/img2.gif")
		};
		JButton [] b = {
				new JButton("Left", ic[0]),
				new JButton("Center"),
				new JButton("Right", ic[1])
		};
		b[0].setPreferredSize(new Dimension(100, 100));
		b[2].setSize(100, 100);
		for(i = 0; i < b.length; i++){
			c.add(b[i]);
		}
		
		//´´½¨¸´Ñ¡¿ò
		JCheckBox [] ck = {new JCheckBox("Left"), new JCheckBox("Right")};
		for (int j = 0; j < ck.length; j++) {
			c.add(ck[j]);
			ck[j].setSelected(true);
		}
		//Create radio Button
		JRadioButton [] r = {new JRadioButton("Left"), new JRadioButton("Right")};
		ButtonGroup rg = new ButtonGroup();
		for (int j = 0; j < r.length; j++) {
			c.add(r[j]);
			rg.add(r[j]);
		}
		r[0].setSelected(true);
		r[1].setSelected(false);
	}
	public static void main(String[] args) {
		J_Button app = new J_Button();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setSize(400, 200);
		app.setVisible(true);
	}
}
