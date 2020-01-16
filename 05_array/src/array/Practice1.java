package array;

/*
크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
A ~ Z까지 몇개인지 출력
단 1줄에 10개씩 출력

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
*/
public class Practice1 {

	public static void main(String[] args) {
		int[] ch = new int[50];
		int[] count = new int[26];

		char num;

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (Math.random() * 26 + 65);
			System.out.print((char) ch[i] + " ");
			if ((i + 1) % 10 == 0)
				System.out.println();
		}

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (ch[i] == 65 + j) {
					count[j]++;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < count.length; i++) {
			System.out.println(((char) (65 + i) + " : ") + count[i]);
		}

	}

}
