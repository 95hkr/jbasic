package fundamentals.chapter4.sec6_extends;
/*
 * 好きなスーパークラスと、そのスーパークラスを継承したサブクラスを作成してください。
 * また、それぞれに好きなフィールドとメソッドを追加してください。
 * 最後にNo004クラスのmainメソッドでサブクラスをインスタンス化して処理を実行するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		Witch w1 = new Witch();
		w1.setTwinkle("ねこ");
		System.out.println("Target：" + w1.getTwinkle());
		System.out.println("効果：" + w1.useMagic());
	}
}

class Magic {
	String twinkle;

	public String getTwinkle() {
		return twinkle;
	}

	public void setTwinkle(String twinkle) {
		this.twinkle = twinkle;
	}
}

class Witch extends Magic {
	public String useMagic() {
		String stick = "Transform";
		return stick;
	}
}
