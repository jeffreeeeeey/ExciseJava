package excise06.selfedu;

public class J_Exception {
	public static void mb_throwException() {
		System.out.println("throw ArithmeticException ");
		throw new ArithmeticException();
	}
	public static void mb_catchArrayException() {
		try {
			mb_throwException();
			System.out.println("other codes in try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("method mb_catchArrayException capture an exception");
		} finally {
			System.out.println("catchArrayException's finally block");
		}
		System.out.println("end of catchArrayException");
	}
	public static void main(String[] args) {
		try {
			mb_catchArrayException();
		} catch (ArithmeticException e) {
			System.out.println("main capture an Exception");
		} finally {
			System.out.println("finally block in main");
		}
		System.out.println("end of handle exception");
	}
}
