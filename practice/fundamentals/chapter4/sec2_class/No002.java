package fundamentals.chapter4.sec2_class;
/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
class Car{
	String parts;

	void setParts(String x) {
		parts = x;
	}

	String getParts() {
		return parts;
	}
}

public class No002 {
	public static void main(String[] args) {

		Car p1 = new Car();
		p1.setParts("タイヤ");

		Car p2 = new Car();
		p2.setParts("ミラー");

		System.out.println(p1.getParts());
		System.out.println(p2.getParts());
	}
}
