package fundamentals.chapter4.sec6_extends;
/*
 * No002のAnimalクラスを継承したDogクラスを作成してください。
 * Dogクラスにはお座りするメソッドを追加してください。
 * mainメソッドでDogクラスをインスタンス化し、犬の名前とお座りしたことを表示させてください。
 */
public class No003 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("ふわみ");
		System.out.println("名前：" + d1.getName());
		System.out.println(d1.inu());
	}
}

class Dog extends Animal {
	public String inu() {
		String お座り = "お座りした";
		return お座り;
	}
}
