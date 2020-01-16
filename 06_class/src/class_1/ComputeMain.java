package class_1;

public class ComputeMain {

	public static void main(String[] args) {
		Compute[] ar = new Compute[3];
		ar[0] = new Compute();
		ar[1] = new Compute();
		ar[2] = new Compute();
		
		ar[0].setX(320);
		ar[0].setY(258);
		
		ar[1].setX(256);
		ar[1].setY(125);
		
		ar[2].setX(452);
		ar[2].setY(365);
		
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		for(Compute data : ar) {
			data.calc();
			System.out.println(data.getX()+"\t"+data.getY()+"\t"+data.getSum()+"\t"+data.getSub()+"\t"+data.getMul()+"\t"+data.getDiv());
		}
		

	}

}
