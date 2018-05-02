package fundamentals.chapter4.sec3_field;
/*
 * インスタンス変数「int x = 10;」を持つクラス「Hoge」を作成し、
 * No003クラスでその変数を表示させるプログラムを作成してください。
 */
class Hoge{

	int x = 10;

	public int num() {
		return this.x;
	}
}


public class No003 {
	public static void main(String[] args) {
		Hoge hg = new Hoge();
		hg.num();
		System.out.println(hg.num());
	}
}
