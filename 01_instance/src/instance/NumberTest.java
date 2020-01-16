package instance;
/*
 * 문제 320, 258를 변수에 저장하여 합을 구하시오 
 * 
 * 결과 
 * 320+258 =xxx
 * 320-258 =xxx
 * 320*258 =xxx
 * 320/258 =xxx
 * 
 */
public class NumberTest {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		double div = (double)a/b;
		
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"/"+b+"="+String.format("%.2f", div));
		System.out.printf(a+"/"+b+"="+"%.2f",div);
		
		
		
		
		

	}

}
