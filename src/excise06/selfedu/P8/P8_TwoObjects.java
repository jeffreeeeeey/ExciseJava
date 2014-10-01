package excise06.selfedu.P8;

public class P8_TwoObjects {
	private static P8_TwoObjects obj1;
	private static P8_TwoObjects obj2;
	private P8_TwoObjects() {
		
	}
	public static P8_TwoObjects getObjects() {
		if (obj1 == null) {
			obj1 = new P8_TwoObjects();
			return obj1;
		}else if (obj2 == null) {
			obj2 = new P8_TwoObjects();
			return obj2;
		}else {
			System.out.println("already two objects, return first one");
			return obj1;
		}
	}
}
