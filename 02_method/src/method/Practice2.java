package method;

/*�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ� 
���� add()���� ���Ͽ� ���� �޴´�

[������]
ù��° �ֻ��� �� : 3
�ι�° �ֻ��� �� : 6
���� 9 �̴�*/
public class Practice2 {

	public static void main(String[] args) {
		Practice2 p = new Practice2();
		int num1 = p.input();
		int num2 = p.input();
		int sum = p.add(num1, num2);
		
		System.out.println("ù��° �ֻ��� �� : "+num1);
		System.out.println("�ι�° �ֻ��� �� : "+num2);
		System.out.println("���� "+sum+"�̴�.");
	}
	
	public int input() {
		return (int)(Math.random()*6+1);
	}
	
	public int add(int num1, int num2) {
		return num1+num2;
	}

}
