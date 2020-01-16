package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		if(args.length!=0)System.out.println("args[0] = "+args[0]);
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.print("���� �Է� : ");
		int num2 = scan.nextInt();
		int num = Integer.parseInt(args[0]);
		System.out.println(num+"/"+num2+" = "+num/num2);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵȴ�");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ���");
		}finally {
			System.out.println("error�� �ְ� ���� ������ ����");
		}
	}

}
