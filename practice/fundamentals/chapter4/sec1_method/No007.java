package fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った値が負であれば「-1」を返し、
 * 0であれば「0」、正であれば「1」を返すメソッド「signOf」を作成してmainメソッド内で使用してください。
 */
public class No007 {

	public static void signOf(int x) {

		if(x <= -1) {
			System.out.println(-1);
		}else if(x >= 1) {
			System.out.println(1);
		}else {
			System.out.println(0);
	}
}

	public static void main(String[] args) {
		signOf(5);
	}
}
