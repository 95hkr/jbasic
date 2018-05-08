package fundamentals.chapter4.sec1_method;
/*
 * ２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 * また、メソッドの動作を検証できるようにプログラムを作成してください。
 * ※平均の計算は整数で行うこと
 */
public class No013 {
	static int num;

	static int avr(int x,int y) {
				num = x + y;
				num /= 2;

		return num;
	}

	public static void main(String[] args) {
		avr(5,9);

		System.out.println(avr(5,9));
	}
}
