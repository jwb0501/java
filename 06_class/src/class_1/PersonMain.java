package class_1;

class Person{
	private String name;//필드, 초기값
	private int age;
	
	public void setName(String n) {//구현
		name = n;
	}
	
	public void setAge(int n) {
		age = n;
	}
	
	public void setData(String string, int i) {
		name = string;
		age = i;
	}
	
	public void setData() {
		
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}


//-------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa;
		aa = new Person();
		System.out.println(aa);
		aa.setName("홍길동");//호출
		aa.setAge(25);
		System.out.println("이름 = "+aa.getName()+"\t 나이 = "+aa.getAge());
		System.out.println();
		
		Person bb;
		bb = new Person();
		System.out.println(bb);
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("이름 = "+bb.getName()+"\t 나이 = "+bb.getAge());
		System.out.println();
		
		Person cc;
		cc= new Person();
		System.out.println(cc);
		cc.setData("또치", 30);
		System.out.println("이름 = "+cc.getName()+"\t 나이 = "+cc.getAge());
		System.out.println();
		
		Person dd;
		dd = new Person();
		System.out.println(cc);
		dd.setData();
		System.out.println("이름 = "+dd.getName()+"\t 나이 = "+dd.getAge());
		System.out.println();
	}

}
