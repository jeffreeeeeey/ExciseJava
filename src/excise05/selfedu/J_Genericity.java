package excise05.selfedu;

import java.lang.reflect.Method;

class J_C1
{
	public void mb_methodA()
	{
		System.out.print("A");
	}
}

interface J_C2
{
	public void mb_methodB();
}

class J_C3 extends J_C1 implements J_C2
{
	public void mb_methodB()
	{
		System.out.print("B");
	}
}

class J_T<T extends J_C1 & J_C2>
{
	public void mb_methodT(T t)
	{
		t.mb_methodA();
		t.mb_methodB();
	}
}

public class J_Genericity {
	public static void main(String[] args) {
		J_T<J_C3> a= new J_T<J_C3>();
	}
}
