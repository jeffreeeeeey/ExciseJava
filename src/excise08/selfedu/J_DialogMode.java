package excise08.selfedu;
import javax.swing.*;

public class J_DialogMode {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello");
		JOptionPane.showConfirmDialog(null, "Are you alright?");
		JOptionPane.showInputDialog(null, "How do you feel now?");
		String [] s = {"Fine", "not good"};
		JOptionPane.showInputDialog(null, "How do you feel?", "input", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
	}
}
