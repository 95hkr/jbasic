package fundamentals.chapter2.sec4_operator;
/*
 * int i = 5;boolean b;の2つの変数を定義して、「i < 10」の結果を変数bに代入して結果を表示するプログラムを作成してください。
 */
public class No004 {
 public static void main(String[] args) {
	 int i;
	 i = 5;

	 boolean b = true & false;

	 b = i < 10;

	 System.out.println(b);
 }
}
