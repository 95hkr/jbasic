package fundamentals.chapter4.sec6_extends;
/*
 * Animalクラスを継承したcatクラスを作成してください。
 * また、Catクラスには、鳴き声のフィールドを作成し、ニャーとなくメソッドを定義してください。
 * mainメソッドでCatクラスをインスタンス化して、猫の名前と「ニャー」を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setName("にゃんす");
		System.out.println("名前：" + c1.getName());
		System.out.println(c1.neko());
	}
}

class Animal {
	String name;

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
}

class Cat extends Animal {
	String 鳴き声;
	public String neko() {
		鳴き声 = "ニャー";
		return 鳴き声;
	}
}
