package fundamentals.chapter4.sec7_override;

/*
 * ユーザクラスを継承した一般ユーザクラスと管理者クラスを作成し、showメソッドをオーバーライドしてください。
 * また、オーバーライドしたshowメソッド内でidとnameに任意の値を代入するように修正してください。
 * 最後に、mainメソッド内でそれぞれのクラスをインスタンス化し、showメソッドを実行するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		一般User user = new 一般User();
//		System.out.println
		user.show();

		管理者 kanri = new 管理者();
		kanri.show();

	}
}

class User {
	String name;
	int id;
	void show() {
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}

class 一般User extends User {
	@Override
	void show() {
		name = "hana";
		id = 8;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}

class 管理者 extends User {
	@Override
	void show() {
		name = "sht";
		id = 1;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}