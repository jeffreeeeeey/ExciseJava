package excise06.selfedu;

public class J_RuntimeExample {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("number of processors:" + r.availableProcessors());
		try {
			r.exec("cmd /c start dir");
		} catch (Exception e) {
			System.err.println("命令运行不正常");
			e.printStackTrace();
		}
		System.out.println("最大内存:"+r.maxMemory());
		System.out.println("总内存"+r.totalMemory());
	}
}
