package excise12.selfedu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

import javax.swing.*;

import java.io.*;

public class J_ChatServer extends JFrame {
	private ObjectInputStream m_input;
	private ObjectOutputStream m_Output;
	private JTextField m_enterField;
	private JTextArea m_displayArea;
	private int m_clientNumber;
	
	public J_ChatServer() {
		super("�����������");
		Container c = getContentPane();
		m_enterField = new JTextField();
		m_enterField.setEnabled(false);
		m_enterField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					String s = e.getActionCommand();
					m_Output.writeObject(s);
					m_Output.flush();
					mb_displayAppend("��������:"+s);
					m_enterField.setText("");//Clear the field
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}//ʵ�ֽӿ�ActionListener���ڲ������
		});//addActionListener�������ý���
		c.add(m_enterField, BorderLayout.NORTH);
		m_displayArea = new JTextArea();
		c.add(new JScrollPane(m_displayArea), BorderLayout.CENTER);
	}//end of J_ChatServer constructor;
	
	public void mb_displayAppend(String s) {
		m_displayArea.append(s + "\n");
		m_displayArea.setCaretPosition(m_displayArea.getText().length());
		m_enterField.requestFocusInWindow();
	}
	
	public boolean mb_isEndSession(String m) {
		if (m.equalsIgnoreCase("q")) {
			return(true);
		}
		if (m.equalsIgnoreCase("quite")) {
			return(true);
		}
		if (m.equalsIgnoreCase("exit")) {
			return(true);
		}
		if (m.equalsIgnoreCase("end")) {
			return(true);
		}
		if (m.equalsIgnoreCase("����")) {
			return(true);
		}
		return(false);
	}// end of mb_isEndSession;
	
	public void mb_run() {
		try {
			ServerSocket server = new ServerSocket(5000);
			String mString;
			while (true) {
				m_clientNumber++;
				mb_displayAppend("�ȴ�����[" + m_clientNumber + "]");
				Socket s = server.accept();
				mb_displayAppend("���յ��ͻ�������[" + m_clientNumber + "]");
				m_Output = new ObjectOutputStream(s.getOutputStream());
				m_input = new ObjectInputStream(s.getInputStream());
				m_Output.writeObject("���ӳɹ�");
				m_Output.flush();
				m_enterField.setEnabled(true);
				do {
					mString = (String)m_input.readObject();
					mb_displayAppend("�ͻ���" + mString);
				} while (!mb_isEndSession(mString));
				
				m_Output.writeObject("q");
				m_Output.flush();
				m_enterField.setEnabled(false);
				m_Output.close();
				m_input.close();
				s.close();
				mb_displayAppend("����[" + m_clientNumber + "]����");
			}//end of while loop;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		J_ChatServer app = new J_ChatServer();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setSize(350, 150);
		app.setVisible(true);
		app.mb_run();
	}
}
