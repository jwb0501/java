package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class ChiMoney extends Money {

	@Override
	public void calcMoney(int money) {
		super.exchangeMoney = money / 166.36;
	}

	@Override
	public void dispMoney(int money) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.print(nf.format(money));
		System.out.print("  ¡æ  ");
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(exchangeMoney));
	}

}
