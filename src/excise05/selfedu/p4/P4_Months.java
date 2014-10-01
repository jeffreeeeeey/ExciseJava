package excise05.selfedu.p4;

enum MONTHS {
	first, second, third, fouth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth;
}

public class P4_Months {
	
	public static void main(String[] args) {
		long startTime, endTime;
		startTime = System.nanoTime();
		MONTHS [] months = MONTHS.values();
		int day = 0;
		for (MONTHS m:months) {
			switch (m) {
			case first:
			case third:
			case fifth:
			case seventh:
			case eighth:
			case tenth:
			case twelfth:
				day = 31;
				break;
			case second:
				day = 28;
				break;
			default:
				day = 30;
				break;
			}
			System.out.println("the " + m + " month has " + day + " days.");
		}
		
		long eclapse = System.nanoTime() - startTime;

		System.out.println("time eclapse: "+eclapse);
	}
}
