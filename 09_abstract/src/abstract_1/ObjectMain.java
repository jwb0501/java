package abstract_1;

/*
 * class Object{
 * 		public boolean equals(Object ob){} //������ ��(�ּ�)
 * 		public String toString(){} //Ŭ����@16����
 * 		public int hasCode(){} //10����
 * }
 * 
 * class String extends Object{
 * 		public boolean equals(Object ob){} //���ڿ� ��
 * 		public String toString(){} //���ڿ�
 * 		public int hasCode(){} //int 21��, �Ұ��� ���ڿ��� ���Ѵ�
 * }
 */

class Test extends Object{
	public String toString(){
		return getClass()+"���ٺ�";
	}
	
}

//------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t = "+t);//�ּ�
		System.out.println("��ü t = "+t.toString());//�ּ�
		System.out.println("��ü t = "+t.hashCode());//�ּҸ� 10������ ��ȯ
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü str = "+str);
		System.out.println("��ü str = "+str.toString());
		System.out.println("��ü str = "+str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); //f
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); //t
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd)); //f ������
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //f ������
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); //f ������
		System.out.println("ee.equals(ff) : " + ee.equals(ff)); //t ���ڿ�
		System.out.println();
		
		
		
	}

}
