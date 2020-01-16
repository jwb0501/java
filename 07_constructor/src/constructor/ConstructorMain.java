package constructor;

class ConstructorTest{
	
	private String name;
	private int age;
	
	//생성자 Overload
	public ConstructorTest() {
		System.out.println("기본 생성자");
	}
	
	public ConstructorTest(String name) {
		this();//Overload된 다른 생성자를 호출
		this.name=name;
	}
	
	public ConstructorTest(int age) {
		this("코난");
		this.age=age;
	}

	public String getName() {return name;}
	public int getAge() {return age;}
	
	
}
	
//-------------------------
public class ConstructorMain {

	public static void main(String[] args) {
//		ConstructorTest aa = new ConstructorTest();
//		System.out.println("이름= "+aa.getName()+"\t 나이="+aa.getAge());
//		System.out.println();
//		
//		ConstructorTest bb = new ConstructorTest("홍길동");
//		System.out.println("이름= "+bb.getName()+"\t 나이="+bb.getAge());
//		System.out.println();
//		

		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("이름= "+cc.getName()+"\t 나이="+cc.getAge());
		System.out.println();

	}

}
