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
		
		System.out.print("���� �Է�:");
		int width = Integer.parseInt(br.readLine());
		System.out.print("���� �Է�:");
		int length = Integer.parseInt(br.readLine());
		System.out.print("���� �Է�:");
		int height = Integer.parseInt(br.readLine());
		float volume = 0f;
		
		MethodEx1 m = new MethodEx1();
		
		volume = m.calcVolume(width, length, height);
		System.out.println("������ü�� ���Ǵ� "+volume);
		
		

	}

}
