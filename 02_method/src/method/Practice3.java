package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�*/
public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		int sec = Integer.parseInt(br.readLine());
		Practice3 p = new Practice3();
		p.time(sec);
		
	}
	
	public void time(int sec) {
		int hour = sec/3600;
		int minute = sec%3600/60;
		int second = sec%3600%60;
		System.out.println(hour+"�ð� "+minute+"�� "+second+"�� �Դϴ�.");
	}

}
