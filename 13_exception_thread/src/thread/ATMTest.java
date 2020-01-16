package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {

	private long depositeMoney = 100000;// �ܾ�
	private long balance;// ã�� �ݾ�

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm);
		Thread son = new Thread(atm, "�Ƶ�");

		mom.setName("����");
		mom.start();
		son.start();

	}

	@Override
	// public synchronized void run() { - ����ȭo
	public void run() {
		//synchronized (ATMTest.class) {// - ����ȭo
		synchronized (this) {// - ����ȭo
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName() + "�� �ȳ��ϼ���");

			try {
				System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
				balance = Long.parseLong(br.readLine());

			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}

			withDraw();// �ܾ� ���
		}
	}

	private void withDraw() {
		if (balance <= depositeMoney) {
			if (balance % 10000 == 0) {
				depositeMoney = depositeMoney - balance;
				System.out.println("�ܾ��� " + depositeMoney + "�� �Դϴ�");
			} else
				System.out.println("���� ������ �Է��ϼ���");
		} else
			System.out.println("�ܾ� �ʰ�");
		System.out.println();
	}

}