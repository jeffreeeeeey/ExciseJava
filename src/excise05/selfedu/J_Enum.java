package excise05.selfedu;

enum E_SEASON {
	´º¼¾, ÏÄ¼¾, Çï¼¾, ¶¬¼¾;
}

public class J_Enum {
	public static void main(String[] args) {
		E_SEASON [] sa = E_SEASON.values();
		for (int i = 0; i < sa.length; i++) {
			switch (sa[i]) {
			case ´º¼¾:
				System.out.println("´º¼¾»¨ÂúÌì");
				break;
			case ÏÄ¼¾:
				System.out.println("ÏÄ¼¾ÈÈÎÞ±ß");
				break;
			case Çï¼¾:
				System.out.println("Çï¼¾¹ûÀÛÀÛ");
				break;
			case ¶¬¼¾:
				System.out.println("¶¬¼¾Ñ©°¨°¨");
				break;
			default:
				break;
			}//end of switch;
		}//end of for loop;
	}//end of main;
}
