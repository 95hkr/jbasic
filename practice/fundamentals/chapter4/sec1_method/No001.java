package fundamentals.chapter4.sec1_method;
/*
 * 2つのint型を引数に取る足し算メソッドを作成してください。
 * mainメソッドからそのメソッドを使っていくつかの足し算を実行させて結果を表示させるプログラムを作成してください。
 */
class No001 {
	public static void a(int x,int y) {
		int a = x + y;
		System.out.println(a);
	}

	public static void main(String[] args) {
		a (8,8);
		a (5,6);
		a (3,7);
	}
}
