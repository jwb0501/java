package class_1;

class Person{
	private String name;//�ʵ�, �ʱⰪ
	private int age;
	
	public void setName(String n) {//����
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
		aa.setName("ȫ�浿");//ȣ��
		aa.setAge(25);
		System.out.println("�̸� = "+aa.getName()+"\t ���� = "+aa.getAge());
		System.out.println();
		
		Person bb;
		bb = new Person();
		System.out.println(bb);
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("�̸� = "+bb.getName()+"\t ���� = "+bb.getAge());
		System.out.println();
		
		Person cc;
		cc= new Person();
		System.out.println(cc);
		cc.setData("��ġ", 30);
		System.out.println("�̸� = "+cc.getName()+"\t ���� = "+cc.getAge());
		System.out.println();
		
		Person dd;
		dd = new Person();
		System.out.println(cc);
		dd.setData();
		System.out.println("�̸� = "+dd.getName()+"\t ���� = "+dd.getAge());
		System.out.println();
	}

}
