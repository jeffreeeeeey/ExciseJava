package excise05.selfedu;

enum E_SEASON {
	����, �ļ�, �＾, ����;
}

public class J_Enum {
	public static void main(String[] args) {
		E_SEASON [] sa = E_SEASON.values();
		for (int i = 0; i < sa.length; i++) {
			switch (sa[i]) {
			case ����:
				System.out.println("����������");
				break;
			case �ļ�:
				System.out.println("�ļ����ޱ�");
				break;
			case �＾:
				System.out.println("�＾������");
				break;
			case ����:
				System.out.println("����ѩ����");
				break;
			default:
				break;
			}//end of switch;
		}//end of for loop;
	}//end of main;
}
