package method;

public class Boxing {

	public static void main(String[] args) {
		int a=25;
		double b = (double)a/3;
		
		//String a = "25";
		//int b = (int)a;
		
		int c=5;
		Integer d = c; //AutoBoxing �⺻�� -> ��ü��
		// Integer d = new Integer(c);// jdk5.0���� 
		
		Integer e =5;
		int f = e; //unAutoBoxing ��ü�� -> �⺻��
		// int f = e.intValue(); // jdk5.0����

	}

}
