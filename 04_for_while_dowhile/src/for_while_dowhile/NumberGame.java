package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//숫자맞추기 게임
//1~100사이의 난수를 발생하여 맞추는 게임
//[실행결과]
//		숫자 입력: 50
//		50보다 큽니다
//		숫자 입력: 90
//		90보다 작습니다
//		...
//		숫자 입력: 87
//		딩동뎅 xx번만에 맞추셨습니다
//	        또 할래(Y/N) : N
//  	프로그램 종료
public class NumberGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user, count;
		
		do {
			com = (int) (Math.random() * 100 + 1);
			count = 0;

			while (true) {
				System.out.print("숫자 입력 : ");
				user = Integer.parseInt(br.readLine());
				count++;
				if (user == com)
					break;
				if (user < com)
					System.out.println(user + "보다 큽니다");
				else
					System.out.println(user + "보다 작습니다");
			} // while
			System.out.println();
			System.out.println("딩동뎅 " + count + "번만에 맞추셨습니다");
			System.out.println();
			System.out.print("또 할래(Y/N) : ");
			String again = br.readLine();
			System.out.println();
			if (again.equals("N")||again.equals("n"))
				break;
		} while (true);
		System.out.println("프로그램 종료");

	}

}
