package excise07.selfedu;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class J_PrintStream {
	public static void main(String[] args) {
		try {
			PrintStream p = new PrintStream("out.txt");
			p.printf("%1$d + %2$d = %3$d", 1, 2, (1 + 2));
			p.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("∑¢…˙“Ï≥£:" + e);
			e.printStackTrace();
		}
	}
}
