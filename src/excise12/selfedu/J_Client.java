package excise12.selfedu;

import java.io.DataInputStream;
import java.net.Socket;;

public class J_Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 5001);
			DataInputStream dataIn = new DataInputStream(s.getInputStream());
			System.out.println("Client received:" + dataIn.readUTF());
			dataIn.close();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
