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

	int quality(int x, int y,int z) {
		sweet = x;
		color = y;
		Big = z;

		System.out.println("甘さ："+ sweet);
		System.out.println("色："+ color);
		System.out.println("大きさ："+ Big);

		return sweet;
	}
}

public class No004 {

}
