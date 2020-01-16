package instance;

public class Variable {

	public static void main(String[] args) {
		boolean a;
		a=true;
		System.out.println("a = "+a);
		
		char b;
		b='A';
		System.out.println("b = "+b);
		
		char c;
		c=65;
		// c=65536; 에러 int형
		System.out.println("c = "+c);
		
		int d = 65;
		System.out.println("d = "+d);
		
		int e = 'A';
		System.out.println("e = "+e);
		
		int f = (int)25l; //25l long형
		
		//float g = 43.8; // 실수형은 기본이 double형
		float g = 43.8f;
		System.out.println("g = "+g);
			

	}

}
