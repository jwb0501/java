package inheritance;

/*
[����1]
* Ŭ���� : Exam
* �ʵ�
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111";//����-���ȭ

* �޼ҵ�
������
compare() - ��
getName()
getOx()
getScore()

* Ŭ���� : ExamMain

[������]
�ο��� �Է� : 3

�̸� �Է� : ȫ�浿
�� �Է� : 13211

�̸� �Է� : �ڳ�
�� �Է� : 11111

�̸� �Է� : ��ġ
�� �Է� : 13242

�̸�	  1 2 3 4 5	����
ȫ�浿   O X X O O	60
�ڳ�	  O O O O O	100
��ġ	  O X X X X	20
*/
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�ο��� �Է� : ");
		Exam[] ar = new Exam[scan.nextInt()];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Exam();
			ar[i].compare();
		}

		System.out.println("�̸�\t12345\t����");
		for (Exam data : ar) {
			System.out.print(data.getName() + "\t");
			for (int i = 0; i < data.getOx().length; i++) {
				System.out.print(data.getOx()[i]);
			}
			System.out.println("\t" + data.getScore());
		}
	}

}
