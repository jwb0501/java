package instance;


public class Practice6 {

	public static void main(String[] args) {
		char ch = 'T';
		int result = ch>='A'&&ch<='Z'?ch+32:ch-32;
		
		System.out.println(ch+"->"+(char)result);

	}

}
