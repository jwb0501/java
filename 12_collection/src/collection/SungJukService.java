package collection;

import java.beans.DesignMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	Scanner scan = new Scanner(System.in);
	ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	DecimalFormat decimalFormat = new DecimalFormat("#.##");

	public void menu() {
		while (true) {
			System.out.println("****************");
			System.out.println("   1. �Է�");
			System.out.println("   2. ���");
			System.out.println("   3. �˻�");
			System.out.println("   4. ����");
			System.out.println("   5. ����");
			System.out.println("   6. ��");
			System.out.println("****************");
			System.out.print(" ��ȣ : ");
			int num = scan.nextInt();
			if (num == 6)
				break;
			else if (num == 1)
				insertArticle();
			else if (num == 2)
				printArticle();
			else if (num == 3)
				searchArticle();
			else if (num == 4)
				deleteArticle();
			else if (num == 5)
				sortArticle();
			else
				System.out.println("1~6�߿� �����ϼ���");
		}

	}

	private void sortArticle() {
		while (true) {
			System.out.println("1. �̸����� ��������");
			System.out.println("2. �������� ��������");
			System.out.println("3. �����޴�");
			System.out.print(" ��ȣ �Է� : ");
			int num = scan.nextInt();
			if (num == 3) {
				System.out.println();
				break;
			} else if (num == 1) {// �̸� ��������
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto0, SungJukDTO dto1) {
						return dto0.getName().compareTo(dto1.getName());
					}
				};
				Collections.sort(list, com);
				printArticle();
				System.out.println();

			} else if (num == 2) {// ���� ��������
				Collections.sort(list);
				printArticle();
				System.out.println();

			}
		}
	}// sort

	private void deleteArticle() {
		System.out.print("���� �� �̸� �Է� : ");
		String name = scan.next();
		int count = 0;

		Iterator<SungJukDTO> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO dto = it.next();
			if (dto.getName().equals(name)) {
				it.remove(); // it.next()�� ��ȯ�� ���� �����
				count++;
			}
		}
		if (count == 0)
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		else
			System.out.println(count + "�� ���� �Ϸ�");
		System.out.println();
		
//		for (int i=0; i<list.size();i++) {
//			if (list.get(i).getName().equals(name)) {
//				list.remove(i);
//				i--;
//				count++;
//			}
//			
//		}
//		if(count==0) System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
//		else System.out.println("�����͸� �����Ͽ����ϴ�");
	}// delete

	private void searchArticle() {
		System.out.print("�˻� �� �̸� �Է� : ");
		String name = scan.next();
		int count = 0;
		for (SungJukDTO data : list) {
			if (data.getName().equals(name)) {
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
				System.out.println(data.getNum() + "\t" + data.getName() + "\t" + data.getKor() + "\t" + data.getEng()
						+ "\t" + data.getMat() + "\t" + data.getTot() + "\t" + decimalFormat.format(data.getAvg()));
				count++;
			}
		}
		if (count == 0)
			System.out.println("ã���� �ϴ� �̸��� �����ϴ�");

	}// serch

	private void printArticle() {
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for (SungJukDTO data : list) {
			System.out.println(data.getNum() + "\t" + data.getName() + "\t" + data.getKor() + "\t" + data.getEng()
					+ "\t" + data.getMat() + "\t" + data.getTot() + "\t" + decimalFormat.format(data.getAvg()));
		}
		System.out.println();
	}// print

	public void insertArticle() {
		SungJukDTO dto = new SungJukDTO();

		System.out.print("��ȣ �Է� : ");
		dto.setNum(scan.nextInt());
		System.out.print("�̸� �Է� : ");
		dto.setName(scan.next());
		System.out.print("���� �Է� : ");
		dto.setKor(scan.nextInt());
		System.out.print("���� �Է� : ");
		dto.setEng(scan.nextInt());
		System.out.print("���� �Է� : ");
		dto.setMat(scan.nextInt());
		dto.calc();

		list.add(dto);
		System.out.println();
	}// insert

}