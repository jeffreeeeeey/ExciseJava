package excise12.selfedu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;

import javax.swing.*;

public class J_ChatClient extends JFrame{
	private ObjectInputStream m_input;
	private ObjectOutputStream m_output;
	private JTextField m_enter;
	private JTextArea m_display;
	
	public J_ChatClient() {
		super("聊天组件客户端");
		Container c = getContentPane();
		m_enter = new JTextField();
		m_enter.setEnabled(false);
		m_enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Send message to server
				try {
					String s = e.getActionCommand();
					m_output.writeObject(s);
					m_output.flush();
					mb_displayAppend("客户端" + s);
					m_enter.setText("");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		c.add(m_enter, BorderLayout.NORTH);
		m_display = new JTextArea();
		c.add(new JScrollPane(m_display), BorderLayout.CENTER);
	}
	
	public void mb_displayAppend(String s) {
		m_display.append(s + "\n");
		m_display.setCaretPosition(m_display.getText().length());
		m_enter.requestFocusInWindow();
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
		if (m.equalsIgnoreCase("结束")) {
			return(true);
		}
		return(false);
	}
	
	public void mb_run(String host, int port) {
		try {
			mb_displayAppend("try to connect");
			Socket s = new Socket(host, port);
			String m; //message from server;
			m_output = new ObjectOutputStream(s.getOutputStream());
			m_input = new ObjectInputStream(s.getInputStream());
			m_enter.setEnabled(true);
			do{
				m = (String)m_input.readObject();
				mb_displayAppend("Server:" + m);
			}while(!mb_isEndSession(m));
			m_output.writeObject("q");
			m_output.flush();
			m_output.close();
			m_input.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			mb_displayAppend("发生异常");
		}
	}
	public static void main(String[] args) {
		J_ChatClient app = new J_ChatClient();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setSize(350, 150);
		app.setVisible(true);
		if (args.length == 0) {
			app.mb_run("localhost", 5000);
		}else {
			app.mb_run(args[0], 5000);
		}
	}
}
