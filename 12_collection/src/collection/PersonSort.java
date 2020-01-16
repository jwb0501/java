package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple","banana", "pear", "peach","applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar); // 배열
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("또치", 40);
		PersonDTO cc = new PersonDTO("코난", 16);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println("정렬 전 = "+list);
		Collections.sort(list);
		System.out.println("정렬 후 = "+list);
		
		//정렬기준을 이름으로 새롭게 변경
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
				//return dto1.getName().compareTo(dto2.getName()); //String은 자체적으로 컴페어블
			//	return dto2.getName().compareTo(dto1.getName()) 내림차순
			 return dto1.getName().compareTo(dto2.getName())*-1; //내림차순
			}
		};
		System.out.println("\n 이름으로 새롭게 변경");
		Collections.sort(list, com);
		System.out.println(list);
		
		

	}

}
