package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
		int mScore = Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		int lScore = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է��Ͻÿ� : ");
		int homeWork = Integer.parseInt(br.readLine());
		System.out.print("�⼮������ �Է��Ͻÿ� : ");
		int attendance = Integer.parseInt(br.readLine());
		double score = ((mScore+lScore)/2*0.6) + (homeWork*0.2) + (attendance*0.2);
		int score2 = (int)score/10;
		char grade;
		String value;
		
		switch(score2) {
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; 
		}
		
		switch(grade) {
		case 'A': 
		case 'B': value="excellent";break;
		case 'C': 
		case 'D': value="good";break;
		default: value="poor";
		}
	
		System.out.println("����="+String.format("%.2f", score));
		System.out.println("����="+grade);
		System.out.println("��="+value);

	}

}
