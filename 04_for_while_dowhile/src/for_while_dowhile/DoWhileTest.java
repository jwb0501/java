package for_while_dowhile;

public class DoWhileTest {

	public static void main(String[] args) {
		int a=0;
		do {
			a++;
			System.out.print(a+" ");
		}while(a<10);
		System.out.println();
		
		
		//A~Z���� ����ϵ� 1�ٿ� 7���� ����Ͻÿ�.
		char ch= 'A';
		int count = 0;
		do {
			System.out.print(ch+" ");
			ch++;
			count++;
			if(count%7==0)System.out.println();
		}while(ch<='Z');
		

	}

}
