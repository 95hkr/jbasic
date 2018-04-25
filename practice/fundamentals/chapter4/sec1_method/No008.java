package fundamentals.chapter4.sec1_method;
/*
 * 3つのint型引数a,b,cの最小値を求めるメソッド「min」を作成して、
 * mainメソッド内で結果を表示させるプログラムを作成してください。
 */
public class No008 {

	static int num;

	public static int min(int a,int b,int c) {
		num = a;

		if(b < num) {
			num = b;

		if(c < num) {
			num = c;
		}
	}
		return num;
}

	public static void main(String[] args) {
		min(55,22,68);
		min(62,25,8);

		System.out.println("最小値："+ min(55,22,68));
		System.out.println("最小値："+ min(62,25,8));
	}
}
