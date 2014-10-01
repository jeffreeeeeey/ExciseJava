package excise05.selfedu.p5;


public class P5_UseExtends  {
	
	public int sum(Number a1, Number a2){
		long startTime = System.nanoTime();
		int n = 0;
		int b1 = a1.intValue();
		int b2 = a2.intValue();
		for (int i = 0; i < 100000; i++) {
			n += b1;
			n += b2;
		}
		long eclapse = System.nanoTime() - startTime;
		System.out.println("Use Extends:" + eclapse);
		return n;
	}
}
