package homework;
/*
 * 需求：
 * 		通过System类的currentTimeMillis()方法，计算出 输出100次我爱你所用的时间
 */
public class CurrentTimeMillis {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			System.out.println("我爱你");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
