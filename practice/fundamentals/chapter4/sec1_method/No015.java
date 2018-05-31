package fundamentals.chapter4.sec1_method;

import java.util.Random;

/*
 * Randomクラスを使用してランダムな整数を返すメソッドを作成してください。
 * 作成したメソッドを使用した結果を変数に格納してください。
 * 最後に変数に格納した結果を画面に表示させるプログラムを作成してください。
 */
public class No015 {
	static int ran() {
		Random r = new Random();
		int num = r.nextInt(100);
		return num;
	}

	public static void main(String[] args) {
		ran();
		System.out.println(ran());
	}
}
