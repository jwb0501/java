package inheritance;

import java.util.Scanner;

public class SalaryManager {
	Scanner scan = new Scanner(System.in);
	EmployeeDTO[] ar = new EmployeeDTO[5];
	
	public void menu() {
		int num = 0;

		while (true) {
			System.out.println(" 1. ��� \n 2. ��� \n 3. ���� \n 4. �˻� \n 5. ����");
			System.out.print("��ȣ �Է� : ");
			num = scan.nextInt();
			if (num == 5) {
				System.out.println("���α׷� ����");
				break;
			} else if (num == 1) {
				insert();
			} else if (num == 2) {
				list();
			} else if (num == 3) {
				update();
			} else if (num == 4) {
				serch();
			} else {
				System.out.println("1~5���� �Է����ּ���");
			}
		}//while
	}

	public void serch() {
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");
				System.out.println(ar[i].getName() + "\t" + ar[i].getPosition() + "\t" + ar[i].getBasePay() + "\t"
						+ ar[i].getBenefit() + "\t" + ar[i].getTaxRate() + "\t" + ar[i].getSalary());
			break;
			}
		} // for
		if (i == 5)
			System.out.println("ã�� ������ �����ϴ�");
		System.out.println();
	}

	public void update() {
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.print("������ ���� �Է� : ");
				ar[i].setPosition(scan.next());
				System.out.print("������ �⺻�� �Է� : ");
				ar[i].setBasePay(scan.nextInt());
				System.out.print("������ ���� �Է� : ");
				ar[i].setBenefit(scan.nextInt());
				ar[i].calc();
				System.out.println("���� �Ϸ�");
				break;
			}
		} // for
		if (i == 5)
			System.out.println("ã�� ������ �����ϴ�");
		System.out.println();
	}

	public void list() {
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != null) {
				System.out.println(ar[i]);
			}
		} // for
		System.out.println();
	}

	public void insert() {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new EmployeeDTO();
				System.out.print("�̸� �Է� : ");
				ar[i].setName(scan.next());
				System.out.print("���� �Է� : ");
				ar[i].setPosition(scan.next());
				System.out.print("�⺻�� �Է� : ");
				ar[i].setBasePay(scan.nextInt());
				System.out.print("���� �Է� : ");
				ar[i].setBenefit(scan.nextInt());
				ar[i].calc();
				break;
			}
		} // for
		System.out.println();
	}
}
