

/*
 * 3
 * 3
 */

public class Test5 {

	public int wert;

	public static void main(String[] args) {
		Test5 test = new Test5();
		test.wert = 2;
		methode(test);
		System.out.println(test.wert);
		methode(test.wert);
		System.out.println(test.wert);
	}

	public static void methode(Test5 test) {
		test.wert++;
	}

	public static void methode(int wert) {
		wert++;
	}
}