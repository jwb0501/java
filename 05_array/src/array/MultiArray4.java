package array;

public class MultiArray4 {

	public static void main(String[] args) {
		String[] name = { "정우복", "임보미", "정나연" };
		int[][] jumsu = new int[3][4];
		double[] avg = new double[3];
		char[] grade = new char[3];

		// 점수
		jumsu[0][0] = 90;
		jumsu[0][1] = 95;
		jumsu[0][2] = 98;
		jumsu[1][0] = 80;
		jumsu[1][1] = 87;
		jumsu[1][2] = 95;
		jumsu[2][0] = 96;
		jumsu[2][1] = 97;
		jumsu[2][2] = 92;
		for (int i = 0; i < jumsu.length; i++) {
			for (int j = 0; j < jumsu[i].length - 1; j++) {
				jumsu[i][3] += jumsu[i][j];
			}
			// 평균
			avg[i] = jumsu[i][3] / 3.0;
		}

		// 학점
		for (int i = 0; i < grade.length; i++) {
			if (avg[i] >= 90)
				grade[i] = 'A';
			else if (avg[i] >= 80)
				grade[i] = 'B';
			else if (avg[i] >= 70)
				grade[i] = 'C';
			else if (avg[i] >= 60)
				grade[i] = 'D';
			else
				grade[i] = 'F';
		}

		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j<jumsu[i].length;j++) {
					System.out.print(jumsu[i][j] + "\t");
			}
			System.out.print(String.format("%.2f", avg[i]) + "\t" + grade[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------------------");

	}

}
