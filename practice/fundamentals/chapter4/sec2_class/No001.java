package fundamentals.chapter4.sec2_class;
/*
 * No001とは別にクラスを定義してNo001クラスのmainメソッド内で定義したクラスをインスタンス化してください。
 * ※クラス名などは任意とする
 */
class Sea{
	String name;

	void setName(String x) {
		name = x;
	}

	String getName() {
		return name;
	}
}

public class No001 {
	public static void main(String[] args) {

		Sea s1 = new Sea();
		s1.setName("イルカ");

		System.out.println(s1.getName());
	}
}
