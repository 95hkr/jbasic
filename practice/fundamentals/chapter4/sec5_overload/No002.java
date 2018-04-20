package fundamentals.chapter4.sec5_overload;
/*
 * 同一の名前を持つメソッドを定義し、それぞれ任意の処理をするプログラムを作成してください。
 */
public class No002 {
	public static void method(int x,int y,int z) {
		int num = x + y + z;
		System.out.println(num);
	}

	public static void method(int x,int y) {
		int num = x * y;
		System.out.println(num);
	}

	public static void main(String[] args) {
		method(55,8,6);
		method(6,23);
	}
}
