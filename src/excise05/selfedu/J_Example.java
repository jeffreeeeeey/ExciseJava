package excise05.selfedu;

public class J_Example {
	public static void main(String[] args) {
		int [] a = {10, 20, 30, 40, 50};
		int s = 0;
		for(int c : a)
			s += c;
		System.out.println("s = " + s);
		
		s = 0;
		for(int i = 1; i <= a.length; i++)
			s += i;
		System.out.println("s = " + s);
	}
}
