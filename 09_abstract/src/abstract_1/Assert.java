package abstract_1;

import java.util.Scanner;

public class Assert {
	
	private int x,y;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값 입력 : ");
		x=scan.nextInt();
		System.out.print("y값 입력 : ");
		y=scan.nextInt();	
	}
	
	public void output() {
		assert y>=0 : "y는 0보다 크거나 같아야 한다";
		
		int z=1;
		for(int i=1; i<=y;i++) {
			z *= x;
		}
		System.out.println(x+"의 "+y+"승은 "+ z);
	}

	public static void main(String[] args) {
		
		Assert a = new Assert();
		a.input();
		a.output();
	
	}
}
