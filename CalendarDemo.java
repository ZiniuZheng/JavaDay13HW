package homework;

import java.util.Calendar;
/*
 * 需求：
 * 		1.通过Calendar对象获取今天是多少年多少月多少日
 * 		2.获取今天在一年中是第几周
 * 		3.获取当前月份在一年中是第几个月
 */
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
