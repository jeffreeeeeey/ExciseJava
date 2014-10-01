package excise06.selfedu;

public class J_Singleton {
	private static J_Singleton m_object = new J_Singleton();
	private J_Singleton() {
		
	}
	public static J_Singleton mb_getObject() {
		return m_object;
	}
}
