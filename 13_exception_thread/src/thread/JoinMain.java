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
		System.out.println("스레드 시작");
		t.start();
		try {
			t.join(); // 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		//메인이 끝나도 스레드는 종료되는 않고 백그라운드에서 스레드는 돌아간다.

	}

}
