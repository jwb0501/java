package instance;

public class Operator2 {

	public static void main(String[] args) {
		boolean a = 25>54;
		System.out.println("a = "+a);
		System.out.println("!a = "+!a);
		System.out.println();
		
		//Ŭ���� �޸� ���� - new
		String b ="apple";//���ڿ� literal
		String c = new String("apple");
		System.out.println("b==c : "+ (b==c?"����":"�ٸ���"));//�ּ�=������
		System.out.println("b!=c : "+ (b!=c?"��":"����"));
		System.out.println();
		System.out.println("b.equals(c) : "+(b.equals(c)?"����":"�ٸ���"));
		System.out.println("!b.equals(c) : "+(!b.equals(c)?"��":"����"));
		
		

	}

}
