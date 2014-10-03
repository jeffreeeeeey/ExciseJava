package excise12.selfedu;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J_Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5001);
			while (true) {
				Socket s = server.accept();
				System.out.println("Server receive connection from clients");
				DataOutputStream dataout = new DataOutputStream(s.getOutputStream());
				dataout.writeUTF("Hello client ÄãºÃ");
				dataout.close();
				s.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
