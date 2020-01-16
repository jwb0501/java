package thread;

class JoinTest implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

//---------------
public class JoinMain {

	public static void main(String[] args) {
		Thread t = new Thread(new JoinTest());
		System.out.println("������ ����");
		t.start();
		try {
			t.join(); // 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
		//������ ������ ������� ����Ǵ� �ʰ� ��׶��忡�� ������� ���ư���.

	}

}
