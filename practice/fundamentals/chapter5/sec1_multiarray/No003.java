package fundamentals.chapter5.sec1_multiarray;
/*
 * int型の3次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※3次元配列の各要素数は3とする。
 */
public class No003 {
	public static void main(String[] args) {
		int[][][] array = new int[3][3][3];

		array[0][0][0] = 15;
		array[0][0][1] = 12;
		array[0][1][2] = 4;
		array[0][2][0] = 3;
		array[0][2][2] = 22;
		array[1][0][0] = 11;


		System.out.println(array[1][0][0]);
	}
}
