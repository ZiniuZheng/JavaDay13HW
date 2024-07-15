package homework;

import java.util.Date;
/*
 * 需求：
 * 		1.通过Date对象获取当前时间的毫秒值
 * 		2.计算出明天这个时间的毫秒值
 * 		3.将明天这个时间的毫秒值转换成Date对象
 */
public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		long t = d.getTime()+1000*3600*24;
		Date d2 = new Date();
		d2.setTime(t);
		System.out.println(d2.toLocaleString());
		System.out.println(d2);
	}

}
