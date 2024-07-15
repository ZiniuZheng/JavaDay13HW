package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 需求：
 * 		1.将当前时间解析成 xxxx年xx月xx日 xx:xx:xx 这种格式显示
 * 		2.已知一个字符串时间String date = "2000_02_29#####23-23-23";
 * 			a.将字符串时间转换成一个Date对象
 * 			b.通过对象获取出以上Date对象明天这个时候的毫秒值
 * 			c.通过刚才获取的毫秒值获取出明天的Date对象
 * 			d.将获取出的新的Date对象的时间以xxxx年xx月xx日 xx:xx:xx 这种格式显示出来
 */
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
