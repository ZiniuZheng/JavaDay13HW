package homework;

public class ArraycopyDemo {

	public static void main(String[] args) {
		int[] src = {12,234,45,324};
		int[] dest = new int[2];
		System.arraycopy(src, 1, dest, 0, 2);
		System.out.print("[");
		for(int i=0;i<dest.length;i++) {
			if(i == dest.length-1) {
				System.out.print(dest[i]+"]");
			}else {
				System.out.print(dest[i]+", ");
			}
		}
	}

}
