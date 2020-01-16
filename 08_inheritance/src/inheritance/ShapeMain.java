package inheritance;

import java.util.Scanner;

class ShapeTest {
	protected Scanner scan = new Scanner(System.in);
	protected double area;

	public ShapeTest() {
		System.out.println("ShapeTest �⺻ ������");
	}

	public void calcArea() {
		System.out.println("������ ����մϴ�");
	}

	public void dispArea() {
		System.out.println("������ ����մϴ�");
	}
}
//---------------------
class SamTest extends ShapeTest {
	private int base, height;

	public SamTest() {
		System.out.println("SamTest �⺻ ������");
		System.out.print("�غ� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	
	@Override //������̼�(jdk6����)
	public void calcArea() {
		area = base * height / 2.;
	}

	@Override
	public void dispArea() {
		System.out.println("�ﰢ�� ���� = " + area);
	}
}
//---------------------
class SaTest extends ShapeTest{
	private int widht, height;
	
	public SaTest() {
		System.out.println("SaTest �⺻ ������");
		System.out.print("���� : ");
		widht = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = widht*height;
	}

	@Override
	public void dispArea() {
		System.out.println("�簢�� ���� = "+area);
	}
}
//---------------------
class SadariTest extends ShapeTest{
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest �⺻ ������");
		System.out.print("���� : ");
		top = scan.nextInt();
		System.out.print("�Ʒ��� : ");
		bottom = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}

	@Override
	public void calcArea() {
		area = (top+bottom)*height/2.;
	}

	@Override
	public void dispArea() {
		System.out.println("��ٸ��� ���� = "+area);
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
		shape = new SamTest();//���յ� ���߱�, �θ�=�ڽ�, �ڽ�=(�ڽ�)�θ�
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
