package fundamentals.chapter4.sec1_method;
/*
 * 「Hello」と表示するメソッド「greet」を作成してmainメソッド内で使用するプログラムを作成してください。
 */
public class No011 {

	static String a = "Hello";
	static String word;

	static void greet(String x) {
		word = a + x;
		System.out.println(word);
	}

	public static void main(String[] args) {
		greet("World");
		greet("Apple");
	}
}
