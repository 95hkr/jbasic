package fundamentals.chapter4.sec7_override;

/*
 * Bookクラスを継承した漫画クラス、小説クラス、雑誌クラスを作成してください。
 * showPriceメソッドをオーバーライドして、それぞれ以下の価格で表示されるようにメソッド内の処理を書き換えてください。
 * 最後に、mainメソッド内でそれぞれの価格を表示させてください。
 *
 * <価格設定>
 * 漫画：Bookの価格 - 200
 * 小説：Bookの価格 - 100
 * 雑誌：Bookの価格 + 100
 */
public class No002 {
	public static void main(String[] args) {
		漫画 comic = new 漫画();
		System.out.println(comic.showPrice());

		小説 novel = new 小説();
		System.out.println(novel.showPrice());

		雑誌 magazine = new 雑誌();
		System.out.println(magazine.showPrice());
	}
}

class Book {
	int price = 500;  // 価格
	int showPrice() {
		return price;
	}
}

class 漫画 extends Book {
	@Override
	int showPrice() {
		return price - 200;
	}
}

class 小説 extends Book {
	@Override
	int showPrice() {
		return price - 100;
	}
}

class 雑誌 extends Book {
	@Override
	int showPrice() {
		return price + 100;
	}
}