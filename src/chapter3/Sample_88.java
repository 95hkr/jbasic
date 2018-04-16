package chapter3;

public class Sample_88 {
	public static void main(String[] args) {
		Pojo data = new Pojo();
		// 画面から受け取ったデータをセット
		data.setName("渋谷");

		// セットしたデータを出力
		String name = data.getName();
		System.out.println(name);
	}
}
