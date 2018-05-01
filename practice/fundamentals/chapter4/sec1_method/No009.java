package fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った整数を引数に取り、
 * その中央値を求めるメソッド「med」を作成してmainメソッド内で使用するプログラムを作成してください。
 */
public class No009 {

	static int num;

	public static int med(int x,int y,int z) {

		if(x >= y) {
			if(y >= z) {
				return y;
			}else if(x <= z) {
				return x;
			}else {
				return z;
			}
		}else if(x > z) {
			return x;
		}else if(y > z) {
			return z;
		}else {
			return y;
		}
	}

	public static void main(String[] args) {
		med(5,7,3);
		med(45,68,85);

		System.out.println(med(5,7,3));
		System.out.println(med(45,68,85));
	}
}
