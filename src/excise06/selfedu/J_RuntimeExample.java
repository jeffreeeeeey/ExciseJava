package excise06.selfedu;

public class J_RuntimeExample {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("number of processors:" + r.availableProcessors());
		try {
			r.exec("cmd /c start dir");
		} catch (Exception e) {
			System.err.println("�������в�����");
			e.printStackTrace();
		}
		System.out.println("����ڴ�:"+r.maxMemory());
		System.out.println("���ڴ�"+r.totalMemory());
	}
}
