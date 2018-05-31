package fundamentals.chapter4.sec1_method;
/*
 * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
 * このメソッドを使用して、九九表を作成してください。
 */
public class No014 {

	static void kuku(int x) {

//		int y =
//		int num = x * y;
		for(int y = 1; y <= 9; y++) {
			int num = x * y;
			System.out.println(x + "×" + y + "=" + num);
		}
	}

	public static void main(String[] args) {
		kuku(1);
		kuku(2);
		kuku(3);
		kuku(4);
		kuku(5);
		kuku(6);
		kuku(7);
		kuku(8);
		kuku(9);
	}
}
