package collection;

public class GenericTest2<T> {
	private T a;

	public GenericTest2(T a) {
		this.a = a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}
	

	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("홍길동");
		//aa.setA("홍길동"); - error 제네릭은 생성자를 통해서 데이트 입력을 받는다
		String name = (String)aa.getA();
		System.out.println("이름="+name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int age = (Integer)bb.getA();//unAutoBoxing
		
		System.out.println("나이="+age);

	}

}
