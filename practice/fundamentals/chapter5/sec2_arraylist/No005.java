package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * データ数が5以上のArrayListを作成し、もしArrayListのサイズが3より大きい場合は、
 * 要素数1~3以外に入っているデータをすべて出力するプログラムを作成してください。
 *
 */
public class No005 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(6);

		num.add(9);
		num.add(5);
		num.add(2);
		num.add(7);
		num.add(1);
		num.add(8);

		for(int i = 3; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
}
