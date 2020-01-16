package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {

	private long depositeMoney = 100000;// 잔액
	private long balance;// 찾는 금액

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm);
		Thread son = new Thread(atm, "아들");

		mom.setName("엄마");
		mom.start();
		son.start();

	}

	@Override
	// public synchronized void run() { - 동기화o
	public void run() {
		//synchronized (ATMTest.class) {// - 동기화o
		synchronized (this) {// - 동기화o
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName() + "님 안녕하세요");

			try {
				System.out.print("찾고자 하는 금액 입력 : ");
				balance = Long.parseLong(br.readLine());

			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}

			withDraw();// 잔액 계산
		}
	}

	private void withDraw() {
		if (balance <= depositeMoney) {
			if (balance % 10000 == 0) {
				depositeMoney = depositeMoney - balance;
				System.out.println("잔액은 " + depositeMoney + "원 입니다");
			} else
				System.out.println("만원 단위로 입력하세요");
		} else
			System.out.println("잔액 초과");
		System.out.println();
	}

}
