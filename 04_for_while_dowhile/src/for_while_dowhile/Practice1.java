package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user;
		String answer;

		while (true) {
			System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
			user = Integer.parseInt(br.readLine());
			com = (int) (Math.random() * 3 + 1);
			if (user == 1) {
				if (com == 1) {
					System.out.println("컴퓨터 : 가위     나 : 가위");
					System.out.println("You Draw!!");
				} else if (com == 2) {
					System.out.println("컴퓨터 : 바위     나 : 가위");
					System.out.println("You Lose!!");
				} else {
					System.out.println("컴퓨터 : 보     나 : 가위");
					System.out.println("You Win!!");
				}
			} else if (user == 2) {
				if (com == 1) {
					System.out.println("컴퓨터 : 가위     나 : 바위");
					System.out.println("You Win!!");
				} else if (com == 2) {
					System.out.println("컴퓨터 : 바위     나 : 바위");
					System.out.println("You Draw!!");
				} else {
					System.out.println("컴퓨터 : 보     나 : 바위");
					System.out.println("You Lose!!");
				}
			} else {
				if (com == 1) {
					System.out.println("컴퓨터 : 가위     나 : 보");
					System.out.println("You Lose!!");
				} else if (com == 2) {
					System.out.println("컴퓨터 : 바위     나 : 보");
					System.out.println("You Win!!");
				} else {
					System.out.println("컴퓨터 : 보     나 : 보");
					System.out.println("You Draw!!");
				}
			}
			System.out.print("또 할래?(Y/N)");
			answer = br.readLine();
			if(answer.equals("N")||answer.equals("n")) break;
		}
		System.out.println("프로그램을 종료합니다");

	}

}
