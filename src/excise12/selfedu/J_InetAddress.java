package excise12.selfedu;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class J_InetAddress {
	public static void main(String[] args) {
		String s = "www.llzg.cn";
		InetAddress ts = null;
		try {
			ts = InetAddress.getByName(s);
			
		} catch (UnknownHostException e) {
			// TODO: handle exception
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		}
		if (ts != null) {
			System.out.println("Address:" + ts.getHostAddress());
			System.out.println("������:" + ts.getHostName());
			
		} else {
			System.out.println("�޷����ʵ�ַ:" + s);
		}
	}
}
