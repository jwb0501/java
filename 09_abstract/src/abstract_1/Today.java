package abstract_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("���ó�¥ : "+date);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y�� MM�� dd�� E���� H:m:ss");
		System.out.println("���ó�¥ : "+simpleDateFormat.format(date));
		System.out.println();
		
		//������ - 1987 05 01
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19870501143020");//String -> Date�� ��ȯ
		System.out.println("������ : "+ birth);
		System.out.println("������ : "+ simpleDateFormat.format(birth));
		System.out.println();
		
		//Calendar cal = new Calendar(); error �߻�޼ҵ� ���ȵ�
		//Calendar cal = new GregorianCalendar(); //sub class �̿��� ����
		Calendar cal = Calendar.getInstance(); // �޼ҵ带 �̿��� ����
		
		
		//int year = cal.get(Calendar.YEAR);
		int year = cal.get(1); // YEAR �����
		int month = cal.get(Calendar.MONTH)+1; //1�� = 0
		int day = cal.get(cal.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK); //�Ͽ��� =1
		
		String dayOfWeek=null;
		switch(week) {
		case 1: dayOfWeek="�Ͽ���"; break;
		case 2: dayOfWeek="������"; break;
		case 3: dayOfWeek="ȭ����"; break;
		case 4: dayOfWeek="������"; break;
		case 5: dayOfWeek="�����"; break;
		case 6: dayOfWeek="�ݿ���"; break;
		case 7: dayOfWeek="�����"; break;
		}
		
		System.out.println("���� ��¥ : "+year+"�� "+month+"�� "+day+"�� "+dayOfWeek);
		
	}

}
