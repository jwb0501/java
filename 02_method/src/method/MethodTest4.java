package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//이름(name), 주민번호(id)를 입력하여 성별을 출력하시오
//성별을 구별하는 comp()와 나이를 계산하는 calcAge()을 작성하시오.
//이름 입력 : 홍길동
//주민번호 입력 : 001023-3234567 
//2019-2000+1 = 20, .charAt(자리번호)
//홍길동님은 남자이고 20살 입니다.
public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("주민번호 입력 : ");
		String id = br.readLine();
		
		MethodTest4 mt = new MethodTest4();
		String gender = mt.comp(id);
		int age = mt.calcAge(id);
		
		
		System.out.println(name+"님은 "+gender+"이고 "+age+"살 입니다.");
		
	}


	public String comp(String id) {
		String result = id.charAt(7)==49||id.charAt(7)==51?"남자":"여자";
		return result;
	}
	public int calcAge(String id) {//7번째 자리가 1,2는 1900년대생 / 3,4는 2000년대생
		//String brithyear = id.charAt(0)+""+id.charAt(1)+""; 
		String brithyear = id.substring(0, 2);
		return id.charAt(7)<51? 2019-(1900+Integer.parseInt(brithyear))+1:2019-(2000+Integer.parseInt(brithyear))+1;
	}

}
