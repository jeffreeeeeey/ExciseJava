package excise05.selfedu;
import excise05.selfedu.J_Enum;


public class J_EnumFor {
	public static void main(String[] args) {
		for(E_SEASON c : E_SEASON.values()) {
			System.out.print(c + ", ");
		}
		System.out.println();
		
		E_SEASON [] ca = E_SEASON.values(); 
		for (int i = 0; i < ca.length; i++) {
			E_SEASON c = ca[i];
			System.out.println(c + ", ");
		}
	}
}
