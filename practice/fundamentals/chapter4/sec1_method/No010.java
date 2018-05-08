package fundamentals.chapter4.sec1_method;
/*
 * 1からnまでの全整数の和を求めて返却するメソッドを作成し、
 * mainメソッド内で使用するプログラムを作成してください。
 * ※nはキーボード入力により取得すること
 */
public class No010 {
	static int n;

	static int no(int n) {
		int i = 0;

		for(int a = 1; a <= n; a++) {

		i = a + i;
	}
		return i;
	}

	public static void main(String[] args) {
		no(5);

		System.out.println(no(5));
	}
}
