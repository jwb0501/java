package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		Zoo zoo = new Zoo();
		zoo.tiger();
		//zoo.giraffe(); error 접근불가
		//zoo.elephant();
		//zoo.lion();
		
		

	}

}
