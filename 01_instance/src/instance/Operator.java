package instance;

public class Operator {

	public static void main(String[] args) {
		int a=5;
		a+=2;
		a*=3;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		int b = a++;   
		System.out.println("a="+a+"\t b="+b);
		
		int c = ++a - b--;
		/*
		 * ++a; int c = a-b; b--;
		 */
		System.out.println("a="+a+"\t b="+b+"\t c="+c);
		
		System.out.println("a = "+a++);
		System.out.println("a = "+a);

	}

}
