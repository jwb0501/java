package constructor;

import java.util.Random;

public class RandomTest {
	public RandomTest() {
		System.out.println("����="+Math.random());
		System.out.println("����="+new Random().nextDouble());
		System.out.println("����="+new Random().nextInt());
		System.out.println("����="+new Random().nextInt(100));//0~99
		System.out.println("����="+(new Random().nextInt(100)+1));//1~100
	}
	
	public static void main(String[] args) {
		new RandomTest();

	}

}
