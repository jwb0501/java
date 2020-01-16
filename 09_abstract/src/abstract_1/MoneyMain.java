package abstract_1;

/*
[문제2]
원을 입력하여 달러, 엔, 위안으로 변경하시오
계산은 calcMoney() , 출력은 dispMoney() 하도록 하시오
소수이하 둘째자리까지 표시하고 소수이하 숫자가 없으면 표시하지 않도록 하시오
통화기호도 표시하시오

클래스
Money.java
UsMoney.java
JapMoney.java
ChiMoney.java

MoneyMain.java

[실행결과]
현금 입력 : 500000
1. 달러   2. 엔화   3. 위안  : 1
￦500,000  →  $431.78
*/
import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		System.out.print("1.달러 2.엔화 3.위안 : ");
		int num = scan.nextInt();

		Money m = null;
		if (num == 1) {
			m = new UsMoney();
		} else if (num == 2) {
			m = new JapMoney();
		} else if (num == 3) {
			m = new ChiMoney();
		}
		m.calcMoney(money);
		m.dispMoney(money);

	}
}
