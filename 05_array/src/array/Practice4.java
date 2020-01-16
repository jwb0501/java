package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제4] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
*/

public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		int strike;
		int ball;

		while (true) {
			do {
				System.out.print("게임을 실행하시겠습니까(Y/N) : ");
				yn = br.readLine();
			} while (!yn.equals("y") && !yn.equals("Y") && !yn.equals("n") && !yn.equals("N"));
			if (yn.equals("n") || yn.equals("N"))
				break;

			System.out.println();
			System.out.println("게임을 시작합니다");
			System.out.println();

			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9 + 1);
				for (int j = 0; j < i; j++) { // 중복
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}

			do {
				System.out.print("숫자 입력 : ");
				int num = Integer.parseInt(br.readLine());
				user[0] = num / 100;
				user[1] = num % 100 / 10;
				user[2] = num % 100 % 10;
				strike = 0;
				ball = 0;
				for (int i = 0; i < user.length; i++) {
					for (int j = 0; j < com.length; j++) {
						if (user[i] == com[j])
							if (i == j) {
								strike++;
							} else
								ball++;
					}
				}
				System.out.println(strike + "스트라이크" + ball + "볼");
			} while (strike != 3);
			if (strike == 3)
				break;
		}

	}

}
