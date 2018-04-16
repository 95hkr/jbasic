package fundamentals.chapter2.sec6_if;

/*
 * int型変数x、yに対し、x÷yの演算が割り切れるかどうかを判定するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		int x =88;
		int y = 8;

		if(x % y == 0) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}
}
