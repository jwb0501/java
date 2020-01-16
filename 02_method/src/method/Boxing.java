package method;

public class Boxing {

	public static void main(String[] args) {
		int a=25;
		double b = (double)a/3;
		
		//String a = "25";
		//int b = (int)a;
		
		int c=5;
		Integer d = c; //AutoBoxing 기본형 -> 객체형
		// Integer d = new Integer(c);// jdk5.0이전 
		
		Integer e =5;
		int f = e; //unAutoBoxing 객체형 -> 기본형
		// int f = e.intValue(); // jdk5.0이전

	}

}
