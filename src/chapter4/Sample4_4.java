package chapter4;

import java.util.ArrayList; // インポート宣言

public class Sample4_4 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(); // 初期値なし

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

		num.remove(2); // 削除するもの

		for(int i = 0; i < num.size(); i++) { // ArrayListは.lengthではなく.size()
			System.out.println(num.get(i));
		}
	}
}
