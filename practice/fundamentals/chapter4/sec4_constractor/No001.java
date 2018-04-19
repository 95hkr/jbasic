package fundamentals.chapter4.sec4_constractor;
/*
 * No001クラスとは別に下記のような車クラスを作成してください。
 *
 * <フィールド>
 * ・ガソリン
 *
 * <メソッド>
 * ガソリンを使用して走る機能
 * 現在の残ガソリンを確認する機能
 * 給油する機能
 *
 * <コンストラクタ>
 * ・ガソリンの初期値を指定する
 */
class Car{
	int gas;

	Car(){
		gas = 45;
	}


	int drive(int x) {
		 gas -= x;
		 int km = x * 10;
		return km;
	}

	void drive2() {
		System.out.println("残ガソリン：" + gas);
	}

	void drive3() {
		;
		System.out.println(gas);
	}
}

public class No001 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive(15);
		c1.drive2();
		c1.drive3();
		System.out.println("走行距離："+ c1.drive(15));

	}
}
