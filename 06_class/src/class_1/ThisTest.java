package class_1;

class This{
	
	private String name;
	private int age;
	
	public void setName(String n) {//구현
		name = n;
	}
	
	public void setAge(int n) {
		age = n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

//---------------
public class ThisTest {
	public static void main(String[] args) {
		This aa = new This();
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름 = "+aa.getName()+"\t 나이 = "+aa.getAge());
		System.out.println();
		
		

	}

}
