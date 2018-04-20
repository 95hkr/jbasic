package fundamentals.chapter4.sec4_constractor;
/*
 * 次のようなフルーツクラスを作成してください。
 * <フィールド>
 * ・甘さ
 * ・色
 * ・大きさ
 *
 * <メソッド>
 * ・甘さを表示する
 * ・色を表示する
 * ・大きさを表示する
 *
 * このフルーツクラスをインスタンス化した際に、甘さ、色、大きさをコンストラクタによって初期化し、
 * その後甘さ、色、大きさをそれぞれ表示するプログラムを作成してください。
 *
 */
class Fruit{
	int sweet;
	int color;
	int Big;

	Fruit(){
		sweet = 3;
		color = 3;
		Big = 3;
	}

	void quality(int x, int y,int z) {
		sweet = x;
		color = y;
		Big = z;

		if(x == 3) {
			System.out.println("甘さ：普通");
		}else if(x > 3) {
			System.out.println("甘さ：甘い");
		}else {
			System.out.println("甘さ：すっぱい");
		}

		if(y == 3) {
			System.out.println("色：普通");
		}else if(y > 3) {
			System.out.println("色：濃い");
		}else {
			System.out.println("色：薄い");
		}

		if(z == 3) {
			System.out.println("大きさ：普通");
		}else if(z > 3){
			System.out.println("大きさ：大きい");
		}else {
			System.out.println("大きさ：小ぶり");
		}
	}
}

public class No004 {
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.quality(5,2,3);

	}
}
