package fundamentals.chapter4.sec1_method;
/*
 * int型の年を受け取り、うるう年かどうかを判定するメソッドを定義してください。
 * うるう年の場合はtrue、違う場合はfalseを返します。
 * キーボード入力から年を受け取り、メソッドを使用して判定してください。
 * ※うるう年は、西暦が400で割り切れる年、または100で割り切れず、4で割り切れる年です。
 */
class No005 {
	public static void year(int x) {
		boolean a;
		a = x % 400 == 0;

		System.out.println(a);

	}

	public static void main(String[] args) {
		year(1995);
		year(2000);
	}
}
