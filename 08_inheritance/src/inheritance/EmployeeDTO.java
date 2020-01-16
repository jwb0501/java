package inheritance;

public class EmployeeDTO {
	private String name;
	private String position;
	private int basePay;
	private int benefit;
	private double taxRate;
	private int salary;

	public void calc() {
		if (basePay <= 2000000)
			this.taxRate = 0.01;
		else if (basePay <= 4000000)
			this.taxRate = 0.02;
		else
			this.taxRate = 0.03;

		salary = basePay + benefit - (int) ((basePay + benefit) * taxRate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name+"\t"+position+"\t"+basePay+"\t"+benefit+"\t"+taxRate+"\t"+salary;
	}

}
