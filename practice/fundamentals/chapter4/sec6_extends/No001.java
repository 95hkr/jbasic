package fundamentals.chapter4.sec6_extends;
/*
 * No001クラスにBookクラスを継承してください。
 * また、No001クラス内でsetTitleメソッドを使用して本のタイトルを設定後、
 * getTitleメソッドを使用して設定した本のタイトルを出力するプログラムを作成してください。
 */
class Book {
	String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

public class No001 extends Book {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("花のち晴れ");

		System.out.println("タイトル：" + b1.getTitle());
	}
}
