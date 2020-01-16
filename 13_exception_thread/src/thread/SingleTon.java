package thread;

public class SingleTon {
	private int num=3;
	private static SingleTon instance;
	
//	public static SingleTon getInstance() {
//		if(instance==null) {
//			synchronized(SingleTon.class) {
//				instance = new SingleTon();// �� 1���� ó���Ѵ�
//			}
//		}
//		return instance;
//	}
	public static SingleTon getInstance() {
		if(instance==null) {
			synchronized (SingleTon.class) {
				instance = new SingleTon();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("*** �̱��� ***");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = "+cc);
		System.out.println("num = "+cc.num);
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = "+dd);
		System.out.println("num = "+dd.num);
		System.out.println();
		
		SingleTon ee = SingleTon.getInstance();
		ee.num++;
		System.out.println("ee = "+ee);
		System.out.println("num = "+ee.num);
		System.out.println();
		
	}

}