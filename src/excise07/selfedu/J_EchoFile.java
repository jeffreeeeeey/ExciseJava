package excise07.selfedu;
import java.io.*;

public class J_EchoFile {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("test.txt");
			int i;
			int b = f.read();
			for(i = 0; b != -1; i++) {
				System.out.print((char)b);
				b = f.read();
			}
			System.out.println();
			System.out.println("�ļ��ֽ���Ϊ:" + i);
			f.close();
		} catch (IOException e) {
			System.err.println("�����쳣:" + e);
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
