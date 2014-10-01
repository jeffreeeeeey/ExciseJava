package excise05.selfedu;

public class P2_Square extends P2_Shape implements P2_CaculateArea{

	float width = 0;
	
	public P2_Square(float width) {
		this.width = width;
	}

	public double caculateArea() {
		area = width * width;
		return area;
	}
	
}
