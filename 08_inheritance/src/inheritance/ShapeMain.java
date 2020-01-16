package inheritance;

import java.util.Scanner;

class ShapeTest {
	protected Scanner scan = new Scanner(System.in);
	protected double area;

	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}

	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}

	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
}
//---------------------
class SamTest extends ShapeTest {
	private int base, height;

	public SamTest() {
		System.out.println("SamTest 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	
	@Override //어노테이션(jdk6이후)
	public void calcArea() {
		area = base * height / 2.;
	}

	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area);
	}
}
//---------------------
class SaTest extends ShapeTest{
	private int widht, height;
	
	public SaTest() {
		System.out.println("SaTest 기본 생성자");
		System.out.print("가로 : ");
		widht = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = widht*height;
	}

	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+area);
	}
}
//---------------------
class SadariTest extends ShapeTest{
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본 생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("아랫변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = (top+bottom)*height/2.;
	}

	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = "+area);
	}
}
//---------------------
public class ShapeMain {

	public static void main(String[] args) {
		/*
		 * SamTest sam = new SamTest(); 
		 * sam.calcArea(); 
		 * sam.dispArea();
		 * System.out.println();
		 * 
		 * SaTest sa = new SaTest(); 
		 * sa.calcArea(); s
		 * a.dispArea(); 
		 * System.out.println();
		 * 
		 * SadariTest sdr = new SadariTest(); 
		 * sdr.calcArea(); 
		 * sdr.dispArea();
		 * System.out.println();
		 */
		
		ShapeTest shape;
		shape = new SamTest();//결합도 낮추기, 부모=자식, 자식=(자식)부모
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		
	}

}
