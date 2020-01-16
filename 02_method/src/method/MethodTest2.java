package method;

public class MethodTest2 {
	public static void disp() {//����
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		MethodTest2.disp();//ȣ��
		//new MethodTest2().output();//new ȣ��
		
		MethodTest2 aa = new MethodTest2();
		System.out.println("aa = "+aa);//��Ű����.Ŭ������@16����
		System.out.println("aa = "+aa.toString());//��Ű����.Ŭ������@16����
		System.out.println("aa = "+aa.hashCode());//�ּ� 10������
		
		aa.output();//ȣ��
		System.out.println();
		
		int sum = aa.plus(25,36);
		int sub = aa.minus(25,36);
		int mul = aa.multiply(25,36);
		double div = aa.divide(25,36);
		
		System.out.println("25+36="+sum);
		System.out.println("25-36="+sub);
		System.out.println("25*36="+mul);
		System.out.println("25/36="+div);
	}


	public int plus(int a, int b) {//����
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public double divide(int a, int b) {
		return (double)a/b;
	}
}
