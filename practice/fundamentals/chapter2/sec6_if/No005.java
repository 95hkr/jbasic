package fundamentals.chapter2.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が2桁の数値かどうかを判断するプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		int x = 1;

		if(10 <= x && x <= 100) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}
}
