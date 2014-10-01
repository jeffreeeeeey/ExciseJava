package excise06.selfedu;

public class J_ExceptionCatch {
	public static void main(String[] args) {
		try {
			System.out.println("try block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
			
		}
	}
}
