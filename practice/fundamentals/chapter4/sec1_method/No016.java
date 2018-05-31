package fundamentals.chapter4.sec1_method;
/*
 * 戻り値ありのメソッドを任意に作成し、メソッドを使用した結果を変数に入れずに出力するプログラムを作成してください。
 */
public class No016 {
	static String cafe(String a) {
		String x = "milk";
		String drink = a + x;

		return drink;
	}

	public static void main(String[] args) {
		cafe("iceTea");

		System.out.println(cafe("iceTea"));
	}
}
