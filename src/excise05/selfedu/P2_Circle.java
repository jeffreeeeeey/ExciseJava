package excise05.selfedu;


public class P2_Circle extends P2_Shape implements P2_CaculateArea{
	float radius = 0;

	public P2_Circle(float radius){
		this.radius = radius;
	}
	
	public double caculateArea() {
		area = 3.14 * radius * radius;
		return area;
	}
	
}
