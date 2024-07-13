package homework;

import java.util.Date;
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
