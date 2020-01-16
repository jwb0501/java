package abstract_1;

/*
 * class Object{
 * 		public boolean equals(Object ob){} //참조값 비교(주소)
 * 		public String toString(){} //클래스@16진수
 * 		public int hasCode(){} //10진수
 * }
 * 
 * class String extends Object{
 * 		public boolean equals(Object ob){} //문자열 비교
 * 		public String toString(){} //문자열
 * 		public int hasCode(){} //int 21억, 불가능 문자열이 무한대
 * }
 */

class Test extends Object{
	public String toString(){
		return getClass()+"개바부";
	}
	
}

//------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = "+t);//주소
		System.out.println("객체 t = "+t.toString());//주소
		System.out.println("객체 t = "+t.hashCode());//주소를 10진수로 변환
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = "+str);
		System.out.println("객체 str = "+str.toString());
		System.out.println("객체 str = "+str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); //f
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); //t
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd)); //f 참조값
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //f 참조값
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); //f 참조값
		System.out.println("ee.equals(ff) : " + ee.equals(ff)); //t 문자열
		System.out.println();
		
		
		
	}

}
