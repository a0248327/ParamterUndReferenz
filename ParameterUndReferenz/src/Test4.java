

/*
 * Before change, sb = Hello 
 * strBuf1: Hello 
 * strBuf2: Hi 
 * strBuf3: Hi World!
 * After changeData(n), sb = Hello 
 */

public class Test4 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeData(sb);
		System.out.println("After changeData(n), sb = " + sb);
	}

	public static void changeData(StringBuffer strBuf) {
		System.out.println("strBuf1: " + strBuf);
		StringBuffer sb2 = new StringBuffer("Hi ");
		strBuf = sb2;
		System.out.println("strBuf2: " + strBuf);
		sb2.append("World!");
		System.out.println("strBuf3: " + strBuf);
	}
}