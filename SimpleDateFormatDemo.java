package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		//method();
		method2();
	}
	
	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date = new Date();
		String s = sdf.format(date);
		System.out.println(s);
	}
	
	private static void method2() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd#####HH-mm-ss");
		Date date = sdf.parse("2000_02_29#####23-23-23");
		long time = date.getTime() + 24*3600*1000;
		System.out.println(time);
		date.setTime(time);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s = sdf2.format(date);
		System.out.println(s);
	}
}
