package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�̸�(name), �ֹι�ȣ(id)�� �Է��Ͽ� ������ ����Ͻÿ�
//������ �����ϴ� comp()�� ���̸� ����ϴ� calcAge()�� �ۼ��Ͻÿ�.
//�̸� �Է� : ȫ�浿
//�ֹι�ȣ �Է� : 001023-3234567 
//2019-2000+1 = 20, .charAt(�ڸ���ȣ)
//ȫ�浿���� �����̰� 20�� �Դϴ�.
public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է� : ");
		String id = br.readLine();
		
		MethodTest4 mt = new MethodTest4();
		String gender = mt.comp(id);
		int age = mt.calcAge(id);
		
		
		System.out.println(name+"���� "+gender+"�̰� "+age+"�� �Դϴ�.");
		
	}


	public String comp(String id) {
		String result = id.charAt(7)==49||id.charAt(7)==51?"����":"����";
		return result;
	}
	public int calcAge(String id) {//7��° �ڸ��� 1,2�� 1900���� / 3,4�� 2000����
		//String brithyear = id.charAt(0)+""+id.charAt(1)+""; 
		String brithyear = id.substring(0, 2);
		return id.charAt(7)<51? 2019-(1900+Integer.parseInt(brithyear))+1:2019-(2000+Integer.parseInt(brithyear))+1;
	}

}
