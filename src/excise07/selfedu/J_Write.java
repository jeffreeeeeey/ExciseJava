package excise07.selfedu;
import java.io.IOException;
import java.io.OutputStream;

public class J_Write {
	public static void mb_write(OutputStream out) {
		String s = "OutputStream Example";
		byte [] b = s.getBytes();
		try {
			out.write(b);
			out.flush();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("∑¢…˙“Ï≥£:" + e);
			e.printStackTrace();
		}
	}//end of mb_write
	public static void main(String[] args) {
		mb_write(System.out);
	}
}
