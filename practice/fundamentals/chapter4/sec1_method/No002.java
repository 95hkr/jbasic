package fundamentals.chapter4.sec1_method;
/*
 * double型を引数に取る割り算メソッド作成してください。
 * mainメソッドからそのメソッドを使っていくつかの割り算を実行させて結果を表示させるプログラムを作成してください。
 */
class No002 {
	public static double b(double x,double y) {
		double b = x / y;
		System.out.println(b);
		return b;
	}
	public static void main(String[] args) {
		b(2.5,0.5);
		b(3.6,1.2);
	}
}
