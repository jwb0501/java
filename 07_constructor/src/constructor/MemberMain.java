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
			System.out.println(" 1. 가입 ");
			System.out.println(" 2. 출력 ");
			System.out.println(" 3. 수정 ");
			System.out.println(" 4. 탈퇴 ");
			System.out.println(" 5. 끝내기 ");
			System.out.println("***************");
			System.out.print(" 번호 : ");
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
				System.out.println("1~5번의 숫자를 입력해주세요");
			}
		}
	}

	private void delete(int count) {
		System.out.print("핸도폰 번호 입력 : ");
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
			System.out.println("찾는 회원이 없습니다");
	}

	private void update() {
		System.out.print("핸드폰 번호 입력 : ");
		String phoneNumber = scan.next();
		int i;

		for (i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getPhone() != null && m[i].getPhone().equals(phoneNumber)) {
				System.out.println(
						m[i].getName() + "\t" + m[i].getAge() + "\t" + m[i].getPhone() + "\t\t" + m[i].getAddress());
				System.out.println();
				System.out.print("수정 할 이름 입력 : ");
				m[i].setName(scan.next());
				System.out.print("수정 할 핸드폰 입력 : ");
				m[i].setPhone(scan.next());
				System.out.print("수정 할 주소 입력 : ");
				m[i].setAddress(scan.next());

				System.out.println("1 row updated");
				break;
			} // if
		} // for
		if (i == 5)
			System.out.println("찾는 회원이 없습니다");
	}

	private void list() {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for (MemberDTO data : m) {
			if (data.getAge() != 0)
				System.out.println(
						data.getName() + "\t" + data.getAge() + "\t" + data.getPhone() + "\t\t" + data.getAddress());
		}
	}

	private void insert(int count) {
		if (count == m.length) {
			System.out.println(m.length + "명의 정원이 꽉 찼습니다...");
		} else {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getName() == null) {
					System.out.print("이름 입력 : ");
					m[i].setName(scan.next());
					System.out.print("나이 입력 : ");
					m[i].setAge(scan.nextInt());
					System.out.print("핸드폰 입력 : ");
					m[i].setPhone(scan.next());
					System.out.print("주소 입력 : ");
					m[i].setAddress(scan.next());
					System.out.println();
					System.out.println("1 row created");
					break;
				}
			}
			System.out.println(((m.length - 1) - count) + "자리 남았습니다");
		}
	}

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();

		for (int i = 0; i < mm.m.length; i++) {
			mm.m[i] = new MemberDTO();
		}

		mm.menu();
		System.out.println("프로그램을 종료합니다");
	}

}
