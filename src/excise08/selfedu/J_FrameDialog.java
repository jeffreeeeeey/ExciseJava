package excise08.selfedu;
import java.awt.*;
import javax.swing.*;

public class J_FrameDialog {
	public static void main(String[] args) {
		JFrame app = new JFrame("���");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(400, 400);
		app.setVisible(true);
		
		JDialog d = new JDialog(app, "�Ի���", true);
		Container c = d.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(new JLabel("���"));
		d.setSize(60, 90);
		d.setVisible(true);
	}
}
