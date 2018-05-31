package fundamentals.chapter7.sec1_trycatch;
/*
 * 次のプログラムを実行するとエラーが表示されました。
 * 例外処理を追加して、エラー発生時に「入力値が不正です。」と表示するようにプログラムを追加してください。
 */
public class No002 {
	public static void main(String[] args) {
		try {
			disp(1);
			disp(2);
			disp(3);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("入力値が不正です。");
		}
	}

	private static void disp(int no) {
		int n[] = {1,2,3};

		System.out.println(n[no]);
	}
}
