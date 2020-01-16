package constructor;

import java.text.DecimalFormat;

public class SalaryMain {

	public static void main(String[] args) {
//		SalaryDTO[] s = new SalaryDTO[3];
//		s[0] = new SalaryDTO("���캹", "����", 5000000, 200000);
//		s[1] = new SalaryDTO("�Ӻ���", "����", 3500000, 150000);
//		s[2] = new SalaryDTO("������", "����", 7000000, 500000);

		SalaryDTO[] s = { new SalaryDTO("���캹", "����", 5000000, 200000), 
				          new SalaryDTO("�Ӻ���", "����", 3500000, 150000),
				          new SalaryDTO("������", "����", 7000000, 500000)};

//		SalaryDTO[] s = new SalaryDTO[] { new SalaryDTO("���캹", "����", 5000000, 200000),
//		                                  new SalaryDTO("�Ӻ���", "����", 3500000, 150000),
//		                                  new SalaryDTO("������", "����", 7000000, 500000)};

		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t����");
		for (SalaryDTO data : s) {
			data.calc();
			System.out.println(data.getName() + "\t" + data.getPosition() + "\t" + data.getBasePay() + "\t"
					+ data.getBenefit() + "\t" + data.getTaxRate() + "\t" + data.getTax() + "\t" + df.format(data.getSalary()));
		}

	}

}
