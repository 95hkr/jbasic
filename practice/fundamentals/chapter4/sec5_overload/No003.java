package fundamentals.chapter4.sec5_overload;
/*
 * 足し算クラスを作成し、mainメソッド内でインスタンス化してください。
 * この際、インスタンス時の引数によって「数値の足し算」「小数点数の足し算」「文字列の結合」を行うように
 * 足し算クラスのコンストラクタを定義してください。
 */
class Plus{
	int add;


	Plus(int x,int y){
		int add = x + y;
	}

	Plus(double x,double y){
		double add = x + y;
	}

	Plus(int x,int y,int z){
		int add = x + y + z;
	}
}

public class No003 {
	public static void main(String[] args) {

		Plus p1 = new Plus(1,8);

		Plus p2 = new Plus(1.5,0.8);

		Plus p3 = new Plus("りんご","はちみつ","スープ");


		System.out.println(p1.add);
		System.out.println(p2.add);
		System.out.println(p3.add);
	}
}
