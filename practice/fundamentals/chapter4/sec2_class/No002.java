package fundamentals.chapter4.sec2_class;
/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
class Car{
	String parts;

	String setParts(String x) {
		parts = x;
		return parts;
	}
}

public class No002 {
	public static void main(String[] args) {

		Car c1 = new Car();
		String par = c1.setParts("タイヤ");

		Car c2 = new Car();
		String par2 = c2.setParts("ミラー");

		System.out.println(par);
		System.out.println(par2);
	}
}
