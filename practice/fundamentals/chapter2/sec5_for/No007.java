package fundamentals.chapter2.sec5_for;
/*
 * 次のように画面に表示するプログラムをfor文を使って作成してください。
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class No007 {
	public static void main(String[] args) {

		for(int a = 1; a <= 5; a++) {

			System.out.println();

			for(int b = 0; b < a; b++)

		System.out.print("*");
		}
	}
}
