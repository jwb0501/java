package class_2;

public class Fruit {
	private String pum;
	private int jan, fed, mar, tot;
	private static int sumJan, sumFeb, sumMar;

	public Fruit() {

	}

	public Fruit(String pum, int jan, int fed, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.fed = fed;
		this.mar = mar;
	}

	public void calcTot() {
		tot = jan + fed + mar;
		sumJan += jan;
		sumFeb += fed;
		sumMar += mar;
	}

	public void display(Fruit[] ar) {
		System.out.println("---------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("---------------------------------------");
		for (Fruit data : ar) {
			System.out.println(data.pum + "\t" + data.jan + "\t" + data.fed + "\t" + data.mar + "\t" + data.tot);
		}
		System.out.println("---------------------------------------");
	}

	public static void output() {
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
	}

}
