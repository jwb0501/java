package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/)입력: +
25+36=xx

a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/)입력: /
25/36=xx.xxx

a값 입력 : 25
b값 입력 : 36
연산자(+,-,*,/)입력: $
연산자 error*/
public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자(+,-,*,/) 입력 : ");
		String op  = br.readLine();
		
		//if(op.equals("+"))
		switch(op) {
		case "+": System.out.println(a+"+"+b+"="+(a+b)); break;
		case "-": System.out.println(a+"-"+b+"="+(a-b)); break;
		case "*": System.out.println(a+"*"+b+"="+(a*b)); break;
		case "/": 
			//System.out.println(a+"/"+b+"="+(String.format("%.3f", (double)a/b))); 
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a+"/"+b+"="+df.format((double)a/b));
			break;
		default : System.out.println("연산자 error");
		}
		
		
		
		

	}

}
