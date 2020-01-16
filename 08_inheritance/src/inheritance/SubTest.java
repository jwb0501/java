package inheritance;

public class SubTest extends SuperTest {

	private String name;
	private int age;
	
	public SubTest() {
		System.out.println("SubTest �⺻������");
	}

	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest ������");
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
	}
	
	public void output() {
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}

	public static void main(String[] args) {
		SubTest aa = new SubTest("ȫ�浿", 25, 79.5, 182.5);
		aa.output();
		System.out.println("--------------");
		aa.disp();
		System.out.println();
		
		SuperTest bb = new SubTest("��ġ", 15, 60, 120);
		bb.disp();
		//bb.output(); error
		
	}

}
