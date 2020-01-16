package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("ChildTest 기본생성자");
	}

	public ChildTest(String name, int age, double weight, double height) {
		super(weight, height);//부모생성자 호출
		
		System.out.println("ChildTest 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}
	
	public void disp() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}

	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동", 25, 79.5, 182.5);
		aa.disp();
		System.out.println();
		
		SuperTest bb = new ChildTest("또치", 15, 60, 120);
		bb.disp();//Override

	}

}
