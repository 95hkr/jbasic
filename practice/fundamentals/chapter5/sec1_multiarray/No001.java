package fundamentals.chapter5.sec1_multiarray;
/*
 * int型の2次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※2次元配列の要素数は任意とする。
 */
public class No001 {
	public static void main(String[] args) {
		int[][]array = new int[2][3];

		array[0][0] = 5;
		array[0][1] = 7;
		array[0][2] = 32;
		array[1][0] = 17;
		array[1][1] = 54;
		array[1][2] = 92;

		for(int a = 0; a < array.length; a++) {
			for(int b = 1; b < array[a].length; b++) {
				System.out.println(array[a][b]);
			}
		}
	}
}
