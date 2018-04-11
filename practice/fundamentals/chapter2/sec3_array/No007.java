 package fundamentals.chapter2.sec3_array;
/*
 * int型の配列を作成し、10,20,30,40,50を代入し、
 * 配列から値を1つずつ取り出して出力するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		int[] intA = new int[5];

		intA[0] = 10;
		intA[1] = 20;
		intA[2] = 30;
		intA[3] = 40;
		intA[4] = 50;

		for(int i = 0; i < intA.length; i++) {
		System.out.println(intA[i]);
		}
	}
}
