package fundamentals.chapter4.sec1_method;
/*
 * 3つのint型引数a,b,cの最小値を求めるメソッド「min」を作成して、
 * mainメソッド内で結果を表示させるプログラムを作成してください。
 */
public class No008 {

	static int num;

	public static int min(int a,int b,int c) {
		num = a;
		num = b;
		num = c;

		if(a <= b) {
			return num;
		}else if(b <= c) {
			return num;
		}else {
			return num;
	}
}

	public static void main(String[] args) {
		min(45,42,3);

		System.out.println("最小値："+ num);
	}
}
