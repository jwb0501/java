package instance;

public class Variable2 {
	int a; // field, 초기화, 인스턴스 변수
	static int b; // field, 초기화, 클래스 변수
	String str;

	public static void main(String[] args) {
		int a; //local variable(지역변수), 쓰레기값 (반드시초기화)
		a=10;
		System.out.println("지역a="+a);
		System.out.println("필드a="+new Variable2().a);
		System.out.println("필드b="+b);
		System.out.println("필드str="+new Variable2().str);
		//System.out.println("필드str="+str); static붙임
		
	}

}
