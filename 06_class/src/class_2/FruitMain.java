package class_2;

/*
[����2]
���� �Ǹŷ� ���ϱ�
���� �����հ赵 ���Ͻÿ�

Ŭ���� : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

������
calcTot()
display()
output() - static

Ŭ���� : FruitMain

[������]
---------------------------------
PUM	JAN   	FEB   	MAR	TOT
---------------------------------
���    	100   	80    	75     	255
����     	30    	25    	10     	xxx
����     	25    	30    	90     	xxx
---------------------------------
        	xxx   	xxx   	xxx		output()�� ó��
*/
public class FruitMain {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		Fruit[] ar = { new Fruit("���", 100, 80, 75), new Fruit("����", 30, 25, 10), new Fruit("����", 25, 30, 70) };

		for (Fruit data : ar) {
			data.calcTot();
		}
		f.display(ar);
		Fruit.output();

	}

}
