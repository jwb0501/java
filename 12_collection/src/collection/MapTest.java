package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");// value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");// key 중복허용

		// System.out.println(map.get("book101"));

//		코드입력: book501
//		없는key입니다
//		코드입력: book301
//		피오나
		
		 String key; System.out.print("코드입력 : "); 
		 key = scan.next(); 
//		 if(map.get(key) == null) System.out.println("없는 key 입니다"); 
//		 else System.out.println(map.get(key));
		 

		if (map.containsKey(key))
			System.out.println(map.get(key));
		else 
			System.out.println("없는 key 입니다");
		

	}

}
