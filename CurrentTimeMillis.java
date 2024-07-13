package homework;

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
