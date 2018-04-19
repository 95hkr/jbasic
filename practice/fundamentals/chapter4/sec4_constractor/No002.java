package fundamentals.chapter4.sec4_constractor;
/*
 * インスタンス化した際に、「Hello」と表示するクラス「Hello」を作成し、
 * mainメソッド内でインスタンス化してください。
 */
class Hello{
	String hi;

	String greet(String x) {
		hi = x;
		System.out.println(x);
		return hi;
	}
}

public class No002 {
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.greet("Hello");
	}
}
