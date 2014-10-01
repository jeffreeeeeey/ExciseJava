package excise07.selfedu;
import java.io.InputStream;
import java.io.IOException;

public class J_Echo {
	public static void mb_echo(InputStream in)
	{
		try {
			while (true) {
				int i = in.read();
				if (i == -1) {
					break;
				}
				char c = (char)i;
				System.out.print(c);
			}
		} catch (IOException e) {
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		mb_echo(System.in);
	}
}
