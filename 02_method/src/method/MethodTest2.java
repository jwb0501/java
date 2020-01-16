package method;

public class MethodTest2 {
	public static void disp() {//구현
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		MethodTest2.disp();//호출
		//new MethodTest2().output();//new 호출
		
		MethodTest2 aa = new MethodTest2();
		System.out.println("aa = "+aa);//패키지명.클래스명@16진수
		System.out.println("aa = "+aa.toString());//패키지명.클래스명@16진수
		System.out.println("aa = "+aa.hashCode());//주소 10진수로
		
		aa.output();//호출
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


	public int plus(int a, int b) {//구현
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
