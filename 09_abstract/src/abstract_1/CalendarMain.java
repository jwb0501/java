package abstract_1;

/*
Ŭ������ : CalendarTest

�⵵ �Է� : 2002
�� �Է� : 10	

��	��	ȭ	��	��	��	��
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

�⺻������ - �⵵, �� �Է�
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
