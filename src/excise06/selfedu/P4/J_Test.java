package excise06.selfedu.P4;

public class J_Test {
	public static void mb_createException() {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void mb_method() {
		try {
			mb_createException();
			System.out.println("a");
		} catch (ArithmeticException e) {
			System.err.println("b");
		} finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
	public static void main(String[] args) {
		try {
			mb_method();
		} catch (Exception e) {
			System.err.println("m");
		}
		System.out.println("n");
	}
}
