package homework;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/*
 * 需求：
 * 		1.键盘录入一个日期字符串，格式为 xxxx-xx-xx，代表此人的出生日期
 * 		2.利用此人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
 */
public class CalculatorDemo {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的姓名:");
		String name = sc.nextLine();
		System.out.println("请输入你的出生年份");
		int year = sc.nextInt();
		while(year<1900||year>2024) {
			System.out.println("你输入的年份有误，请重新输入");
			year = sc.nextInt();
		}
		System.out.println("请输入你的出生月份(1-12)");
		int month = sc.nextInt();
		while(month<1||month>12||(year==2024&&month>7)) {
			System.out.println("你输入的月份有误，请重新输入");
			month = sc.nextInt();
		}
		System.out.println("请输入你的出生日期(1-31)");
		int day = sc.nextInt();
		boolean flag = false;
		if(day<1||day>31)
			flag = true;
		if(year%4==0&&month==2&&day>29)
			flag = true;
		if(year%4!=0&&month==2&&day>28)
			flag = true;
		switch(month){
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>30) {
				flag = true;
				break;
			}
		default:
			break;
		}
		if(year==2024&&month==7&&day>13)
			flag = true;
		while(flag) {
			System.out.println("你输入的日期有误，请重新输入");
			day = sc.nextInt();
			flag = false;
			if(day<1||day>31)
				flag = true;
			if(year%4==0&&month==2&&day>29)
				flag = true;
			if(year%4!=0&&month==2&&day>28)
				flag = true;
			switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>30) {
					flag = true;
					break;
				}
			default:
				break;
			}
			if(year==2024&&month==7&&day>13)
				flag = true;
		}
		String s = year+"-"+month+"-"+day;
		method(name,s);
	}
	
	private static void method(String name, String s) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(s);
		long start = birthday.getTime();
		long now = System.currentTimeMillis();
		long time = now - start;
		float day = time/(1000*3600*24);
		System.out.println(name + "目前活了" + day + "天");
	}
}
