package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
[����3] �ζ� 
ũ�Ⱑ 6���� ������ �迭�� ��Ƽ� 1~45������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
��, ���ڰ� �ߺ��Ǹ� �ȵȴ�

input() - ���� �߻�, �ߺ��� ���ڰ� ������ �ٽ� �߻�
output() - ���
*/
public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lotto = new int[6];
		int money;
		Practice3 p = new Practice3();

		System.out.print("���� �Է� : ");
		money = Integer.parseInt(br.readLine());
		for (int i = 1; i <= money / 1000; i++) {
			p.input(lotto);
			//Arrays.sort(lotto);// ��������
			p.sort(lotto);
			p.output(lotto);
			System.out.println();
			if (i % 5 == 0)
				System.out.println();
		}

	}

	public void sort(int[] lotto) {
		//Selection Sort
		int temp;
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {//��������
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
				
			}
		}
		
	}

	public void output(int[] lotto) {
		for (int data : lotto) {
			System.out.print(String.format("%4d", data));
		}
	}

	public void input(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			// �ߺ�üũ
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}

}
