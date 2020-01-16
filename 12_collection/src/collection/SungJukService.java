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
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 검색");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정력");
			System.out.println("   6. 끝");
			System.out.println("****************");
			System.out.print(" 번호 : ");
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
				System.out.println("1~6중에 선택하세요");
		}

	}

	private void sortArticle() {
		while (true) {
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전메뉴");
			System.out.print(" 번호 입력 : ");
			int num = scan.nextInt();
			if (num == 3) {
				System.out.println();
				break;
			} else if (num == 1) {// 이름 오름차순
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto0, SungJukDTO dto1) {
						return dto0.getName().compareTo(dto1.getName());
					}
				};
				Collections.sort(list, com);
				printArticle();
				System.out.println();

			} else if (num == 2) {// 총점 내림차순
				Collections.sort(list);
				printArticle();
				System.out.println();

			}
		}
	}// sort

	private void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();
		int count = 0;

		Iterator<SungJukDTO> it = list.iterator();
		while (it.hasNext()) {
			SungJukDTO dto = it.next();
			if (dto.getName().equals(name)) {
				it.remove(); // it.next()가 반환한 값을 지운다
				count++;
			}
		}
		if (count == 0)
			System.out.println("찾고자 하는 이름이 없습니다.");
		else
			System.out.println(count + "개 삭제 완료");
		System.out.println();
		
//		for (int i=0; i<list.size();i++) {
//			if (list.get(i).getName().equals(name)) {
//				list.remove(i);
//				i--;
//				count++;
//			}
//			
//		}
//		if(count==0) System.out.println("찾고자 하는 이름이 없습니다.");
//		else System.out.println("데이터를 삭제하였습니다");
	}// delete

	private void searchArticle() {
		System.out.print("검색 할 이름 입력 : ");
		String name = scan.next();
		int count = 0;
		for (SungJukDTO data : list) {
			if (data.getName().equals(name)) {
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(data.getNum() + "\t" + data.getName() + "\t" + data.getKor() + "\t" + data.getEng()
						+ "\t" + data.getMat() + "\t" + data.getTot() + "\t" + decimalFormat.format(data.getAvg()));
				count++;
			}
		}
		if (count == 0)
			System.out.println("찾고자 하는 이름이 없습니다");

	}// serch

	private void printArticle() {
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (SungJukDTO data : list) {
			System.out.println(data.getNum() + "\t" + data.getName() + "\t" + data.getKor() + "\t" + data.getEng()
					+ "\t" + data.getMat() + "\t" + data.getTot() + "\t" + decimalFormat.format(data.getAvg()));
		}
		System.out.println();
	}// print

	public void insertArticle() {
		SungJukDTO dto = new SungJukDTO();

		System.out.print("번호 입력 : ");
		dto.setNum(scan.nextInt());
		System.out.print("이름 입력 : ");
		dto.setName(scan.next());
		System.out.print("국어 입력 : ");
		dto.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		dto.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		dto.setMat(scan.nextInt());
		dto.calc();

		list.add(dto);
		System.out.println();
	}// insert

}
