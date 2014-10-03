package excise12.selfedu;

import java.net.URI;
import java.net.MalformedURLException;
import java.net.URL;

public class J_URL {
	public static void main(String[] args) {
		try {
			URL u = new URL("http://www.llzg.com");
			System.out.println("in URL:" + u);
			System.out.println("Protocol:" + u.getProtocol());
			System.out.println("Host:" + u.getHost());
			System.out.println("File:" + u.getFile());
			System.out.println("Port:" + u.getPort());
			System.out.println("Ref:" + u.getRef());
			
		} catch (MalformedURLException e) {
			// TODO: handle exception
		}
	}
}
