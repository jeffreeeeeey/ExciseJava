package excise05.selfedu;

public class P2_Caculator<T extends P2_Shape> {
	float n = 9;
	public double getArea(T s){
		double a = s.caculateArea();
		return a;
		
	}
	public static void main(String[] args) {
		P2_Caculator<P2_Shape> caculator = new P2_Caculator<P2_Shape>();
		P2_Circle circle = new P2_Circle(8);
		P2_Square square = new P2_Square(5);
		System.out.println("Circle:" + caculator.getArea(circle));
		System.out.println("Square:" + caculator.getArea(square));
	}
}
