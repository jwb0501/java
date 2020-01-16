package inheritance;

import java.util.Scanner;

public class SalaryManager {
	Scanner scan = new Scanner(System.in);
	EmployeeDTO[] ar = new EmployeeDTO[5];
	
	public void menu() {
		int num = 0;

		while (true) {
			System.out.println(" 1. 등록 \n 2. 출력 \n 3. 수정 \n 4. 검색 \n 5. 종료");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			if (num == 5) {
				System.out.println("프로그램 종료");
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
				System.out.println("1~5번을 입력해주세요");
			}
		}//while
	}

	public void serch() {
		System.out.print("이름 입력 : ");
		String name = scan.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
				System.out.println(ar[i].getName() + "\t" + ar[i].getPosition() + "\t" + ar[i].getBasePay() + "\t"
						+ ar[i].getBenefit() + "\t" + ar[i].getTaxRate() + "\t" + ar[i].getSalary());
			break;
			}
		} // for
		if (i == 5)
			System.out.println("찾는 직원이 없습니다");
		System.out.println();
	}

	public void update() {
		System.out.print("이름 입력 : ");
		String name = scan.next();
		int i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != null && ar[i].getName().equals(name)) {
				System.out.print("수정할 직급 입력 : ");
				ar[i].setPosition(scan.next());
				System.out.print("수정할 기본급 입력 : ");
				ar[i].setBasePay(scan.nextInt());
				System.out.print("수정할 수당 입력 : ");
				ar[i].setBenefit(scan.nextInt());
				ar[i].calc();
				System.out.println("수정 완료");
				break;
			}
		} // for
		if (i == 5)
			System.out.println("찾는 직원이 없습니다");
		System.out.println();
	}

	public void list() {
		System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
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
				System.out.print("이름 입력 : ");
				ar[i].setName(scan.next());
				System.out.print("직급 입력 : ");
				ar[i].setPosition(scan.next());
				System.out.print("기본급 입력 : ");
				ar[i].setBasePay(scan.nextInt());
				System.out.print("수당 입력 : ");
				ar[i].setBenefit(scan.nextInt());
				ar[i].calc();
				break;
			}
		} // for
		System.out.println();
	}
}
