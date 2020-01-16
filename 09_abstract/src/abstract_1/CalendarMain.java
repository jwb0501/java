package abstract_1;

/*
클래스명 : CalendarTest

년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

기본생성자 - 년도, 월 입력
calculator()
display()
*/

import java.text.ParseException;
import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) throws ParseException {
		CalendarTest ct = new CalendarTest();
		
		ct.calculator();
		ct.display();

	}

}
