package fundamentals.chapter2.sec5_for;
/*
 * 1から10までの整数を足した結果を表示させるプログラムをfor文を使って作成してください。
 */
public class No004 {
	public static void main(String[] args) {

		int i = 0;

		for(int a = 1; a <= 10; a++) {

			i = a + i;


			}
		System.out.print(i);
		}
	}
