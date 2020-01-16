package class_2;

public class StaticTest {
	private int a;
	private static int b;
	
	static {
		System.out.println("static �ʱ�ȭ ����");
		b=3;
	}
	
	public StaticTest() {
		System.out.println("�⺻������");
		a=3;
	}
	
	public void cals() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a="+a+"\t b="+b);
	}
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a="+a+"\t b="+b);- error: static�޼ҵ忡���� this�� ������ �� ����
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.cals();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.cals();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.cals();
		st3.disp();
		System.out.println();
		
		StaticTest.output();
		output();
		st.output();
	}

}
