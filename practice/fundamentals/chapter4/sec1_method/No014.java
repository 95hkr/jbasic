package fundamentals.chapter4.sec1_method;
/*
 * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
 * このメソッドを使用して、九九表を作成してください。
 */
public class No014 {

	static void kuku(int x) {

		for(int y = 1; y >= 9; y++) {
			int num = x * y;
			System.out.print(num);
		}
	}
	public static void main(String[] args) {
		kuku(1);
		kuku(2);
	}
}