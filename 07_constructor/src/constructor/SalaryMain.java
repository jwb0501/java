package constructor;

import java.text.DecimalFormat;

public class SalaryMain {

	public static void main(String[] args) {
//		SalaryDTO[] s = new SalaryDTO[3];
//		s[0] = new SalaryDTO("정우복", "부장", 5000000, 200000);
//		s[1] = new SalaryDTO("임보미", "과장", 3500000, 150000);
//		s[2] = new SalaryDTO("정나연", "사장", 7000000, 500000);

		SalaryDTO[] s = { new SalaryDTO("정우복", "부장", 5000000, 200000), 
				          new SalaryDTO("임보미", "과장", 3500000, 150000),
				          new SalaryDTO("정나연", "사장", 7000000, 500000)};

//		SalaryDTO[] s = new SalaryDTO[] { new SalaryDTO("정우복", "부장", 5000000, 200000),
//		                                  new SalaryDTO("임보미", "과장", 3500000, 150000),
//		                                  new SalaryDTO("정나연", "사장", 7000000, 500000)};

		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("이름\t직급\t기본급\t수당\t세율\t세금\t월금");
		for (SalaryDTO data : s) {
			data.calc();
			System.out.println(data.getName() + "\t" + data.getPosition() + "\t" + data.getBasePay() + "\t"
					+ data.getBenefit() + "\t" + data.getTaxRate() + "\t" + data.getTax() + "\t" + df.format(data.getSalary()));
		}

	}

}
