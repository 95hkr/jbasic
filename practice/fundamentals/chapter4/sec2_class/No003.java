package fundamentals.chapter4.sec2_class;
/*
 * No003クラスとは別に、四角形を表すクラスを定義してください。
 * フィールドに縦と横の長さをint型で持つようにします。
 * メソッドとして面積を返すメソッドを定義してください。
 * No003クラスのmainメソッドで四角形クラスをインスタンス化し、面積を表示させるプログラムを作成してください。
 */
class Square{
	int area;

	int num(int height, int length) {
		area = height * length;
		return area;
	}
}

public class No003 {
	public static void main(String[] args) {
		Square suq = new Square();
		int fig = suq.num(5 , 9);

		System.out.println(fig);
	}
}
