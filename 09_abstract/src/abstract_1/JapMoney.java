package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class JapMoney extends Money {

	@Override
	public void calcMoney(int money) {
		super.exchangeMoney = money / 1064.03;
	}

	@Override
	public void dispMoney(int money) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.print(nf.format(money));
		System.out.print("  ¡æ  ");
		nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(exchangeMoney));
	}

}
