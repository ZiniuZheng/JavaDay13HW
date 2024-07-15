package homework;
/*
 * 需求：
 * 		通过System类的arraycopy方法将已知数组int[] arr = {12,234,45,324}中中间两个元素拷贝到另外一个新数组中
 */
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
