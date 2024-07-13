package homework;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("今天是"+year+"年"+month+"月"+day+"日");
		int week = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("这周是第"+week+"周");
		System.out.println("本月是"+month+"月");
	}	
}
