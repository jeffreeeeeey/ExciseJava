package excise05.selfedu;
import java.awt.*;
import javax.swing.*;

public class J_LabelFrame extends JFrame {
	public J_LabelFrame()
	{
		super("框架和标签例程");
		String [] s = {"文本标签", "文字在图标的左侧", "文字在图标下方"};
		ImageIcon[] ic = {null, new ImageIcon("img/img1.gif"), new ImageIcon("img/img2.gif")};
		int [] ih = {0, JLabel.LEFT, JLabel.CENTER};
		int [] iv = {0, JLabel.CENTER, JLabel.BOTTOM};
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i = 0; i < 3; i++)
		{
			JLabel aLabel = new JLabel(s[i], ic[i], JLabel.LEFT);
			if(i>0)
			{
				aLabel.setHorizontalTextPosition(ih[i]);
				aLabel.setVerticalTextPosition(iv[i]);
			}
			aLabel.setToolTipText("第"+(i+1) + "个标签");
			c.add(aLabel);
		}//end of for loop;
	}
	public static void main(String[] args) {
		J_LabelFrame app = new J_LabelFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360, 150);
		app.setVisible(true);
	}
}
