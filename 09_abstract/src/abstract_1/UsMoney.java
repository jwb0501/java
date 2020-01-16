package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class UsMoney extends Money {

	@Override
	public void calcMoney(int money) {
		super.exchangeMoney = money / 1154.50;
	}

	@Override
	public void dispMoney(int money) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.print(nf.format(money));
		System.out.print("  ¡æ  ");
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(exchangeMoney));
	}

}
