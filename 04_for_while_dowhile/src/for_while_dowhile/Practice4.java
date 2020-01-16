package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제4] 덧셈 공부
10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임
문제수는 총 5문제를 제공한다
1문제당 점수 20점씩 계산
만약 틀리면 기회를 1번 더 제공한다

[실행결과]
[1] 25 + 36 = 45
틀렸다
[1] 25 + 36 = 61
딩동뎅

[2] 78 + 10 = 100
틀렸다
[2] 78 + 10 = 95
틀렸다...정답 :
...

당신은 총 x문제를 맞추어서 xx점 입니다

continue(y/n) : w
continue(y/n) : n
프로그램을 종료합니다
*/
public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, sum, answer, count, ok;
		String yn;

		do {
			ok = 0;
			for (int i = 1; i <= 5; i++) {
				num1 = (int) (Math.random() * 90 + 10);
				num2 = (int) (Math.random() * 90 + 10);
				sum = num1 + num2;
				count = 0;
				while (true) {
					System.out.print("[" + i + "] " + num1 + " + " + num2 + " = ");
					answer = Integer.parseInt(br.readLine());
					if (answer == sum) {
						System.out.println("딩동뎅");
						ok++;
						break;
					} else {
						System.out.println("틀렸다");
						count++;
					}
					if (count == 2) {
						System.out.println("틀렸다... 정답 : " + sum);
						break;
					}
				}
			}
			System.out.println("당신은 총 " + ok + "문제를 맞추어서 " + ok * 20 + "점 입니다");
			System.out.println();

			do {
				System.out.print("continue(y/n)");
				yn = br.readLine();
			} while (!yn.equals("n")&&!yn.equals("N")&&!yn.equals("y")&&!yn.equals("Y"));
			if (yn.equals("n")||yn.equals("N"))
				break;
		} while (true);
		System.out.println("프로그램을 종료합니다");
	}

}
