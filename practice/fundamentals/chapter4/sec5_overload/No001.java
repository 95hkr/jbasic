package fundamentals.chapter4.sec5_overload;
/*
 * 2つのint型a,bの最小値、3つのint型abcの最小値を求める以下のメソッドを定義して、
 * mainメソッドで使用するプログラムを作成してください。
 * ・int min(int a,int b)
 * ・int min(int a,int b,int c)
 */
public class No001 {
	static int num;

	public static int min(int a,int b) {
		num = a;
		num = b;

		if(a <= b) {
			System.out.println(num);
		}else {
			System.out.println(num);
		}
		return num;
	}

	public static int min(int a,int b,int c) {
		num = a;
		num = b;
		num = c;

		if(a <= b) {
			System.out.println(num);
		}else if(a < c) {
			System.out.println(num);
		}else if(b < a) {
			System.out.println(num);
		}else if(b < c) {
			System.out.println(num);
		}else if(c < a) {
			System.out.println(num);
		}else if(c < b) {
			System.out.println(num);
		}else {
			System.out.println(num);
		}
		return num;
}

	public static void main(String[] args) {

		min(46,25);
		min(101,105,102);
	}
}

