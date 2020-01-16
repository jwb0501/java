package nested;

public class Outer {
	private String name;
	
	public void output() {
		System.out.println("�̸�="+name+"\t ����="+new Inner().age);
	}
	
	class Inner{
		private int age;
		
		public void disp() {
			System.out.println("�̸�="+Outer.this.name+"\t ����="+age);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "ȫ�浿";
		outer.output();
		
		Outer.Inner inner = outer.new Inner();
		inner.age=25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner();
		inner.age=30;
		inner.disp();
		
		Outer.Inner inner3 = new Outer().new Inner();
		//inner3.name= "�ڳ�";
		inner3.age=35;
		inner3.disp();

	}

}
