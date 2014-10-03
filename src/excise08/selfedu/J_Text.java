package excise08.selfedu;
import java.awt.*;

import javax.swing.*;

public class J_Text {
	public static void main(String[] args) {
		JFrame app = new JFrame("Text Edit");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(320, 200);
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout());
		JTextField [] t = {
			new JTextField("normal text: ", 8), new JTextField("show", 15),
			new JTextField("password text: ", 8), new JPasswordField("hide", 15)
		};
		t[0].setEditable(false);
		t[2].setEditable(false);
		for (int i = 0; i < t.length; i++) {
			c.add(t[i]);
		}
		app.setVisible(true);
	}
}
