package constructor;

import java.util.Scanner;

public class InputTest {
	private int a;
	private double b;
	
	public InputTest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		a=scan.nextInt();
		System.out.print("�Ǽ� �Է� : ");
		b=scan.nextDouble();
	}
	
	public void display() {
		System.out.println(a+"+"+b+"="+(a+b));
	}

	public static void main(String[] args) {
		InputTest a = new InputTest();
		a.display();

	}

}
