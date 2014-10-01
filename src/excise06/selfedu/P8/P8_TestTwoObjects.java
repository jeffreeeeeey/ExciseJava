package excise06.selfedu.P8;

public class P8_TestTwoObjects {
	public static void main(String[] args) {
		P8_TwoObjects a1 = P8_TwoObjects.getObjects();
		P8_TwoObjects a2 = P8_TwoObjects.getObjects();
		P8_TwoObjects a3 = P8_TwoObjects.getObjects();
		if (a1 == a3) {
			System.out.println("same one");
		}
	}
}
