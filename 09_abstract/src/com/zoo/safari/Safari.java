package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		zoo.tiger();
//		zoo.giraffe(); // superŬ������ �����ϸ� ������ �ȵȴ�
//		zoo.elephant();
//		zoo.lion(); //error ���ٺҰ�
		
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe();
//		zoo.elephant();
//		zoo.lion(); //error ���ٺҰ�
		
		

	}

}
