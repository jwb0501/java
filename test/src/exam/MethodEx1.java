package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx1 {
	
	public float calcVolume(int w, int l, int h) {
		return w*l*h;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("가로 입력:");
		int width = Integer.parseInt(br.readLine());
		System.out.print("세로 입력:");
		int length = Integer.parseInt(br.readLine());
		System.out.print("높이 입력:");
		int height = Integer.parseInt(br.readLine());
		float volume = 0f;
		
		MethodEx1 m = new MethodEx1();
		
		volume = m.calcVolume(width, length, height);
		System.out.println("직육면체의 부피는 "+volume);
		
		

	}

}
