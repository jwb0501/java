package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*초를 입력받아서 time()에서 시,분,초를 구하여 출력한다

[실행결과]
초를 입력하시오 : 3850
1시간 4분 10초 입니다*/
public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("초를 입력하시오 : ");
		int sec = Integer.parseInt(br.readLine());
		Practice3 p = new Practice3();
		p.time(sec);
		
	}
	
	public void time(int sec) {
		int hour = sec/3600;
		int minute = sec%3600/60;
		int second = sec%3600%60;
		System.out.println(hour+"시간 "+minute+"분 "+second+"초 입니다.");
	}

}
