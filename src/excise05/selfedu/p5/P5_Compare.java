package excise05.selfedu.p5;

public class P5_Compare {
	public static void main(String[] args) {
		P5_UseGenericity<Integer> useGenericity = new P5_UseGenericity<Integer>();
		P5_UseExtends useExtends = new P5_UseExtends();
		Integer a1 = new Integer(8);
		Integer a2 = new Integer(9);
		int n1 = 0, n2 = 0;
		n1 = useGenericity.sum(a1, a2);
		n2 = useExtends.sum(a1, a2);
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		
	}
}
