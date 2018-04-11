package fundamentals.chapter2.sec3_array;

/*
 * 要素型がintの配列を生成して、一番最後の要素を表示するプログラムを作成してください。
 * 要素数は3以上であること。
 */
public class No005 {
	public static void main(String[] args) {
		int[] Num = new int[4];

		Num[0] = 56;
		Num[1] = 28;
		Num[2] = 6;
		Num[3] = 47;

		System.out.println(Num[3]);
	}
}
