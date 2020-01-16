package inheritance;

/*
[문제1]
* 클래스 : Exam
* 필드
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111";//정답-상수화

* 메소드
생성자
compare() - 비교
getName()
getOx()
getScore()

* 클래스 : ExamMain

[실행결과]
인원수 입력 : 3

이름 입력 : 홍길동
답 입력 : 13211

이름 입력 : 코난
답 입력 : 11111

이름 입력 : 또치
답 입력 : 13242

이름	  1 2 3 4 5	점수
홍길동   O X X O O	60
코난	  O O O O O	100
또치	  O X X X X	20
*/
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("인원수 입력 : ");
		Exam[] ar = new Exam[scan.nextInt()];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Exam();
			ar[i].compare();
		}

		System.out.println("이름\t12345\t점수");
		for (Exam data : ar) {
			System.out.print(data.getName() + "\t");
			for (int i = 0; i < data.getOx().length; i++) {
				System.out.print(data.getOx()[i]);
			}
			System.out.println("\t" + data.getScore());
		}
	}

}
