package array;

/*
������ ���� ���α׷�

menu()
**************
   1. ����            input()
   2. ����            output()
   3. ����Ʈ         list()
   4. ����
**************
  �޴� : 

1���� ���
��ġ �Է� : 3
3��ġ�� ���� / �̹� �����Ǿ��ֽ��ϴ�

2���� ���
��ġ �Է� : 4
4��ġ�� ���� / �����Ǿ� �����ʽ��ϴ�

3���� ���
1��ġ : true
2��ġ : false
3��ġ : true
4��ġ : false
5��ġ : false
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		boolean[] ar = new boolean[5];
		ArrayTest4 at = new ArrayTest4();

		at.menu(ar); // ȣ��
		System.out.println("���α׷��� �����մϴ�");

	}

	private void list(boolean[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println((i + 1) + "��ġ : " + ar[i]);
		}
	}

	private void output(boolean[] ar) throws IOException {
		System.out.print("��ġ �Է� : ");
		int index = Integer.parseInt(br.readLine());
		
		if(ar[index-1]) {
			ar[index-1]=false;
			System.out.println(index + "��ġ�� ����");
		}else {
			System.out.println("�����Ǿ� �����ʽ��ϴ�");
		}
	}

	private void input(boolean[] ar) throws IOException {
		System.out.print("��ġ �Է� : ");
		int index = Integer.parseInt(br.readLine());

		if (ar[index - 1]) {
			System.out.println("�̹� �����Ǿ��ֽ��ϴ�");
		} else {
			ar[index - 1] = true;
			System.out.println(index + "��ġ�� ����");
		}
	}

	private void menu(boolean[] ar) throws IOException {
		int num;

		do {
			System.out.println("**************");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����Ʈ");
			System.out.println("4. ����");
			System.out.println("**************");
			System.out.print("��ȣ : ");
			num = Integer.parseInt(br.readLine());
			if (num == 4)
				break;
			if (num < 1 || num > 4) {
				System.out.println("1~4�� �Է� ����");
				continue;
			}
			if (num == 1) {
				input(ar);
			} else if (num == 2) {
				output(ar);
			} else if (num == 3) {
				list(ar);
			}

		} while (true);
	}

}
