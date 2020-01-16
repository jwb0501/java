package class_1;

class ShapeTest {
	public static final double PI = 3.141592;//상수화 final
	
	public void area(int n) {
		System.out.println("원의 넓이 : "+n*n*PI);
	}
	
	public void area(int n, int m) {
		System.out.println("삼각형의 넓이 : "+n*m/2.0);
	}
	
	public void area(int n, int m, int l) {
		System.out.println("사다리꼴의 넓이 : "+(n+m)*l/2.0);
	}
}

public class Practice2 {

	public static void main(String[] args) {
		// ShapeTest.PI = 100; - error
		System.out.println("PI = "+ShapeTest.PI);
		
		ShapeTest st = new ShapeTest();
		
		st.area(3);
		st.area(5, 7);
		st.area(2, 3, 5);
		
	}

}
