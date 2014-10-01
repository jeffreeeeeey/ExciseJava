package excise06.selfedu;

class J_ExceptionNew extends Exception {
	private static int m_number = 0;
	public J_ExceptionNew() {
		m_number++;
	}
	
	public String toString() {
		return("Got New Exception " + m_number + " times.");
	}
	
}

public class J_ExceptionNewExample {
	public static void main(String[] args) {
		try {
			throw new J_ExceptionNew();
		} catch (J_ExceptionNew e) {
			System.err.println(e);
		}
	}
}
