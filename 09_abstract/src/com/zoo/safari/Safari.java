package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		zoo.tiger();
//		zoo.giraffe(); // super클래스로 생성하면 접근이 안된다
//		zoo.elephant();
//		zoo.lion(); //error 접근불가
		
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe();
//		zoo.elephant();
//		zoo.lion(); //error 접근불가
		
		

	}

}
