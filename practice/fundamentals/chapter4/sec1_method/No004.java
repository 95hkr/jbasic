package fundamentals.chapter4.sec1_method;
/*
 * テストの点数を受け取り、合格か不合格の文字列を返すメソッドを定義してください。
 * mainメソッドからキーボード入力で点数を受け取り、メソッドを使って判定してください。
 * ※80点以上で合格とする。
 */

class Test{
	boolean num;

	void setNum(boolean x) {
		num = x;
		num >= 80;
	}

	boolean getNum() {
		return num;
	}
}

public class No004 {
	public static void main(String[] args) {

		Test b1 = new Test();
		b1.setNum(62);

		Test b2 = new Test();
		b2.setNum(87);

		}
	}
