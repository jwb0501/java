package array;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		ar[0] = 25;
		ar[1] = 36;
		ar[2] = 49;
		ar[3] = 62;
		ar[4] = 52;
		
		System.out.println("�迭�� ar = "+ar);
		System.out.println("�迭�� ar = "+ar.toString());
		System.out.println("�迭ũ�� = "+ar.length);
		for(int i = 0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("�Ųٷ� ���");
		for(int i = ar.length-1; i>=0; i--) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("Ȧ�������͸� ���");
		for(int i = 0; i<ar.length; i++) {
			if(ar[i]%2==1) 
				System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("Ȯ�� for");
		for(int data : ar) { // ar�� ũ�⸸ŭ �ݺ��ϸ鼭 �����͸� �����ش�
			System.out.println(data);
		}
		System.out.println();

	}

}
