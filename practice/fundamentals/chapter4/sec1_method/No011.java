package fundamentals.chapter4.sec1_method;
/*
 * 「Hello」と表示するメソッド「greet」を作成してmainメソッド内で使用するプログラムを作成してください。
 */
public class No011 {
	static String word;

	public static void greet(String a,String b) {
		a = "Hello";
		word = a;
	}

	public static void main(String[] args) {
		No011 n1 = new No011();
		n1.greet(word,"World");
		System.out.println(n1);
	}
}
