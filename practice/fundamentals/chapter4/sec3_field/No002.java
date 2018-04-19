package fundamentals.chapter4.sec3_field;
/*
 * クラス内でint型のインスタンス変数、static変数、ローカル変数を定義し、
 * メソッド内でそれぞれ定義した変数の和を表示させるプログラムを作成してください。
 */
public class No002 {
	int x = 15;
	static int y = 23;

	void method() {
		int k = 18;
		System.out.println(x + y + k);
	}

	public static void main(String[] args) {
		No002 no1 = new No002();
		no1.method();
	}
}
