package exam;

public class MethodEx6 {

	public static void main(String[] args) {

		int num = 2;
		int count = 0;
		int order = 0;

		while (true) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2)
				order++;

			if (order == 20) {
				break;
			}else {
				count = 0;
				num++;
			}

		}
		System.out.println("자연수에서 " + order + "번째 소수는 " + num + "입니다.");

	}

}
