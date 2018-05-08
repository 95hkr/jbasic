package fundamentals.chapter4.sec2_class;
/*
 * No005とは別に、名前・身長・体重などをメンバ（フィールド）としてもつ「人間クラス」を作成してください。
 * ※メソッドはつけてもつけなくても良い
 */
class 人間{
	String 名前;
	int 身長;
	int 体重;
	String per(String a,int b,int c) {
		名前 = a;
		身長 = b;
		体重 = c;

		String about = 名前 + 身長 + 体重;

		return about;
	}
}
public class No005 {
	public static void main(String[] args) {
		人間 person = new 人間();
		String x = person.per("やすし",170,70);

		System.out.println("No.1:" + x);
	}
}
