package abstract_1;

/*
[����2]
���� �Է��Ͽ� �޷�, ��, �������� �����Ͻÿ�
����� calcMoney() , ����� dispMoney() �ϵ��� �Ͻÿ�
�Ҽ����� ��°�ڸ����� ǥ���ϰ� �Ҽ����� ���ڰ� ������ ǥ������ �ʵ��� �Ͻÿ�
��ȭ��ȣ�� ǥ���Ͻÿ�

Ŭ����
Money.java
UsMoney.java
JapMoney.java
ChiMoney.java

MoneyMain.java

[������]
���� �Է� : 500000
1. �޷�   2. ��ȭ   3. ����  : 1
��500,000  ��  $431.78
*/
import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		System.out.print("1.�޷� 2.��ȭ 3.���� : ");
		int num = scan.nextInt();

		Money m = null;
		if (num == 1) {
			m = new UsMoney();
		} else if (num == 2) {
			m = new JapMoney();
		} else if (num == 3) {
			m = new ChiMoney();
		}
		m.calcMoney(money);
		m.dispMoney(money);

	}
}
