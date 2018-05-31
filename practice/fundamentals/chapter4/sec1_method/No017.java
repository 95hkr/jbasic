package fundamentals.chapter4.sec1_method;
/*
 * 2つの整数の足し算を行うメソッドと引き算を行うメソッドを作成してください。
 * 足し算を行った結果と任意の数値を引き算メソッドに使用して、結果を表示させるプログラムを作成してください。
 */
public class No017 {
	static int add(int a,int b) {
		int addAnswer = a + b;
		return addAnswer;
	}

	static void sub(int x,int y) {

		int subAnswer = x - y;
		System.out.println(subAnswer);
	}

	public static void main(String[] args) {
		sub(add(15,2),8);
		sub(add(103,16),7);
	}
}
