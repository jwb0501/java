package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";// literal ����
		String b = "apple";
		if (a == b)
			System.out.println("a�� b�� �������� ����");// o
		else
			System.out.println("a�� b�� �������� �ٸ���");
		if (a.equals(b))
			System.out.println("a�� b�� ���ڿ��� ����");// o
		else
			System.out.println("a�� b�� ���ڿ��� �ٸ���");
		System.out.println();

		String c = new String("apple");
		String d = new String("apple");
		if (c == d)
			System.out.println("c�� d�� �������� ����");
		else
			System.out.println("c�� d�� �������� �ٸ���");// o
		if (c.equals(d))
			System.out.println("c�� d�� ���ڿ��� ����");// o
		else
			System.out.println("c�� d�� ���ڿ��� �ٸ���");
		System.out.println();

		String e = "���� ��¥�� " + 2019 + 12 + 30;
		System.out.println("e = " + e);

		/*
		 * ���ڿ��� ������ �ȵǹǷ� �޸� 4�� ���� JVM�� ���ؼ� ������ garbage collector�� ������ garbage
		 * collector�� ����Ǹ� ��ǻ�ʹ� ����� "���� ��¥�� " "���� ��¥�� 2019" "���� ��¥�� 201912"
		 * "���� ��¥�� 20191230" e----->"���� ��¥�� 20191230"
		 */

		System.out.println("���ڿ��� ũ�� = " + e.length());

		for (int i = 0; i < e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i));
		}

		System.out.println("�κ� ���ڿ� ����=" + e.substring(7));
		System.out.println("�κ� ���ڿ� ����=" + e.substring(7, 11));

		System.out.println("�빮�� ���� = " + "Hello".toUpperCase());
		System.out.println("�ҹ��� ���� = " + "Hello".toLowerCase());

		System.out.println("���ڿ� �˻�=" + e.indexOf("¥"));
		System.out.println("���ڿ� �˻�=" + e.indexOf("��¥"));
		System.out.println("���ڿ� �˻�=" + e.indexOf("���ٺ�"));// -1

	}

}
