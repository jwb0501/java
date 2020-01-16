package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Practice8 p = new Practice8();
		int balance = 0;
		int num;

		do {
			System.out.println("***********");
			System.out.println(" 1. 예금");
			System.out.println(" 2. 출금");
			System.out.println(" 3. 잔고");
			System.out.println(" 4. 종료");
			System.out.println("***********");
			System.out.print("번호 선택 : ");
			num = Integer.parseInt(br.readLine());

			switch (num) {
			case 1:
				balance = p.input(balance);
				break;

			case 2:
				balance = p.output(balance);
				break;
			case 3:
				System.out.println("당신의  잔액은 " + balance + "원 입니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");

			}
		} while (!(num == 4));

	}

	// 입금
	public int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		System.out.print("예금액 : ");
		deposit = Integer.parseInt(br.readLine());
		if (deposit % 10000 == 0) {
			balance += deposit;
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("만원 단위로 입력하세요");
		}
		return balance;
	}

	// 출금
	public int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int withdraw;
		System.out.print("출금액 : ");
		withdraw = Integer.parseInt(br.readLine());
		if (balance >= withdraw) {
			balance -= withdraw;
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("잔액이 부족합니다");
		}
		return balance;
	}

}
