package for_while_dowhile;

public class ForTest {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println("hello"+i);
		}
		System.out.println("탈출 i:"+i);
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		
		for(i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//A B C D .....Z
		for(i='A'; i<='Z'; i++) {//'A' = 65 서로 변환
			System.out.print((char)i+" ");
		}
		

	}

}
