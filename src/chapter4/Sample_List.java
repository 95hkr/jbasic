package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Sample_List {
	public static void main(String[] args) {
		// リストコレクションの生成
		List<String> list = new ArrayList<String>();

		// リストへの値格納
		list.add("りんご");
		list.add("ごりら");
		list.add("らっぱ");

		// リストのサイズ取得
		System.out.println("コレクションのサイズ：" + list.size());

		// リストの出力
		System.out.println(list);

		// for文による取り出し
		for(String s :list) { // 拡張for文
			System.out.print(s);
			System.out.print("→");
		}
	}
}
