package for_while_dowhile;

//A~Z �������� 100���� ����Ͻÿ�
//������
//Y R O E D E E ...
//���ٴ� 10����
public class ForTest_Random {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i<=100; i++) { 
			int al = (int)(Math.random() * 26 + 65);
			System.out.print((char)al+" ");
			if(al=='A') count++;
			if(i%10==0)System.out.println();
			}
		 System.out.println();
		 System.out.println("A�� ���� : "+count);

	}

}
