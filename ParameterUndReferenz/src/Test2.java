

/*
 * Before change, sb = Hello 
 * After changeData(n), sb = Hello World!
 */

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeData(sb);
		System.out.println("After changeData(n), sb = " + sb);
	}

	public static void changeData(StringBuffer strBuf) {
		strBuf.append("World!");
	}
}