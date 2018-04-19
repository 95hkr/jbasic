package fundamentals.chapter4.sec4_constractor;
/*
 * No002とは別に人間クラス「Human」を作成し、mainメソッド内でインスタンス化してください。
 * インスタンス化の際に「あなたのIDは1です。」と表示されるようにコンストラクタを追加してください。
 * また、表示されるID番号はインスタンス化するたびに1ずつインクリメントされるようにしてください。
 */
class Human{
	static int id = 1;

	Human(){
		System.out.println("あなたのIDは"+ id + "です。");
		id++;
	}
}

public class No003 {
	public static void main(String[] args) {
		Human human = new Human();
		Human human2 = new Human();
		Human human3 = new Human();
	}
}
