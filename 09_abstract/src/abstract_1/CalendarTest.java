package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	Scanner scan = new Scanner(System.in);
	int year, month, end, week;
	
	public CalendarTest() {
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}
	
	public void calculator()  {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		end = cal.getActualMaximum(cal.DATE);
		week = cal.get(cal.DAY_OF_WEEK);
	}
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int j=1; j<week; j++) {
			System.out.print("\t");
		}
		for(int i=1; i<=end;i++	) {
			System.out.print(i+"\t");
			if(week%7==0) System.out.println();
			week++;
		}
		
	}
}
