package fundamentals.chapter2.sec3_array;

/*
 * 要素型がdoubleで要素数が5の配列を生成して、その全要素を表示するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		double[] dob = new double[5];

		dob[0] = 2.2;
		dob[1] = 3.4;
		dob[2] = 1.5;
		dob[3] = 4.6;
		dob[4] = 3.9;

		System.out.println(dob[0]);
		System.out.println(dob[1]);
		System.out.println(dob[2]);
		System.out.println(dob[3]);
		System.out.println(dob[4]);
	}
}
