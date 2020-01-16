package class_2;

/*
[문제2]
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static

클래스 : FruitMain

[실행결과]
---------------------------------
PUM	JAN   	FEB   	MAR	TOT
---------------------------------
사과    	100   	80    	75     	255
포도     	30    	25    	10     	xxx
딸기     	25    	30    	90     	xxx
---------------------------------
        	xxx   	xxx   	xxx		output()로 처리
*/
public class FruitMain {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		Fruit[] ar = { new Fruit("사과", 100, 80, 75), new Fruit("포도", 30, 25, 10), new Fruit("딸기", 25, 30, 70) };

		for (Fruit data : ar) {
			data.calcTot();
		}
		f.display(ar);
		Fruit.output();

	}

}
