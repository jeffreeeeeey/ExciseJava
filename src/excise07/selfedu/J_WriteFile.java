package excise07.selfedu;
import java.io.*;

public class J_WriteFile {
	public static void main(String[] args) {
		String s = "File output example";
		byte [] b = s.getBytes();
		try {
			FileOutputStream f = new FileOutputStream("out.txt");
			f.write(b);
			f.flush();
			f.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("∑¢…˙“Ï≥£:" + e);
			e.printStackTrace();
		}
	}
}
