package excise12.selfedu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class J_URLReadData {
	public static void main(String[] args) {
		try {
			URL u = new URL("http://www.apple.com");
			BufferedReader r = new BufferedReader(new InputStreamReader(u.openStream()));
			String s;
			while((s = r.readLine()) != null) {
				System.out.println(s);
			}
			r.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
