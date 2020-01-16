package abstract_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		// 3자리마다 ,찍고 소수이하 3째라리
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();

		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		// 유효숫자가 아닌것은 표현하지 않는다
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();

		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		// 0을 강제로 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();

		// NumberFormat nf4 = NumberFormat.getInstance();//메소드를 이용한 생성 기본
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();// 통화표시
		nf4.setMaximumFractionDigits(2);// 소수이하2자리까지
		nf4.setMinimumFractionDigits(2);// 강제 0
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();

		// NumberFormat nf5 = NumberFormat.getInstance();//메소드를 이용한 생성 기본
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);// 통화표시
		nf4.setMaximumFractionDigits(2);// 소수이하2자리까지
		nf4.setMinimumFractionDigits(2);// 강제 0
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();

	}

}
