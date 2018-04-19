package fundamentals.chapter4.sec2_class;
/*
 * No004クラスとは別に以下内容で本クラスを作成してください
 * また、mainメソッドから本クラスのオブジェクトを1つ生成してそれぞれの本の情報を表示するプログラムを作成してください。
 *
 * <フィールド>
 * ・本のタイトル
 * ・著者
 * ・価格
 *
 * <メソッド>
 * ・本のタイトル取得
 * ・著者情報取得
 * ・価格取得
 *
 */
class Book{
	String title;
	String name;
	int money;

	String option(String x,String y,int z) {
		title = x;
		name = y;
		money = z;

		String info = title + name + money;

		return info;
	}
}

public class No004 {
	public static void main(String[] args) {
		Book book = new Book();
		String B = book.option("火花 ","又吉直樹 ",2000);
		System.out.println(B+"円");

	}
}
