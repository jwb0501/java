package constructor;

import java.util.Scanner;

public class MemberMain {
	MemberDTO[] m = new MemberDTO[5];
	Scanner scan = new Scanner(System.in);

	public void menu() {
		int num = 0;
		int count = 0;

		while (true) {
			System.out.println();
			System.out.println("***************");
			System.out.println(" 1. ���� ");
			System.out.println(" 2. ��� ");
			System.out.println(" 3. ���� ");
			System.out.println(" 4. Ż�� ");
			System.out.println(" 5. ������ ");
			System.out.println("***************");
			System.out.print(" ��ȣ : ");
			num = scan.nextInt();

			if (num == 5) {
				break;
			} else if (num == 1) {
				insert(count);
				count++;
			} else if (num == 2) {
				list();
			} else if (num == 3) {
				update();
			} else if (num == 4) {
				delete(count);
				count--;
			} else {
				System.out.println("1~5���� ���ڸ� �Է����ּ���");
			}
		}
	}

	private void delete(int count) {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phoneNumber = scan.next();
		int i;
		for (i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getPhone() != null && m[i].getPhone().equals(phoneNumber)) {
				m[i] = null;
				System.out.println("1 row deleted");
				break;
			}
		}
		if (i == 5)
			System.out.println("ã�� ȸ���� �����ϴ�");
	}

	private void update() {
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		String phoneNumber = scan.next();
		int i;

		for (i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getPhone() != null && m[i].getPhone().equals(phoneNumber)) {
				System.out.println(
						m[i].getName() + "\t" + m[i].getAge() + "\t" + m[i].getPhone() + "\t\t" + m[i].getAddress());
				System.out.println();
				System.out.print("���� �� �̸� �Է� : ");
				m[i].setName(scan.next());
				System.out.print("���� �� �ڵ��� �Է� : ");
				m[i].setPhone(scan.next());
				System.out.print("���� �� �ּ� �Է� : ");
				m[i].setAddress(scan.next());

				System.out.println("1 row updated");
				break;
			} // if
		} // for
		if (i == 5)
			System.out.println("ã�� ȸ���� �����ϴ�");
	}

	private void list() {
		System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
		for (MemberDTO data : m) {
			if (data.getAge() != 0)
				System.out.println(
						data.getName() + "\t" + data.getAge() + "\t" + data.getPhone() + "\t\t" + data.getAddress());
		}
	}

	private void insert(int count) {
		if (count == m.length) {
			System.out.println(m.length + "���� ������ �� á���ϴ�...");
		} else {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getName() == null) {
					System.out.print("�̸� �Է� : ");
					m[i].setName(scan.next());
					System.out.print("���� �Է� : ");
					m[i].setAge(scan.nextInt());
					System.out.print("�ڵ��� �Է� : ");
					m[i].setPhone(scan.next());
					System.out.print("�ּ� �Է� : ");
					m[i].setAddress(scan.next());
					System.out.println();
					System.out.println("1 row created");
					break;
				}
			}
			System.out.println(((m.length - 1) - count) + "�ڸ� ���ҽ��ϴ�");
		}
	}

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();

		for (int i = 0; i < mm.m.length; i++) {
			mm.m[i] = new MemberDTO();
		}

		mm.menu();
		System.out.println("���α׷��� �����մϴ�");
	}

}
