package excise06.selfedu;

public class J_Example {
	public static void main(String[] args) {
		J_Singleton a = J_Singleton.mb_getObject();
		J_Singleton b = J_Singleton.mb_getObject();
		if (a == b) {
			System.out.println("same object");
		}
	}
}
