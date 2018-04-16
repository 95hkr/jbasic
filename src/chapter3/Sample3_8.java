package chapter3;

class RefTest {
	void metTest1(int num) {
		num += 30;
		System.out.println("定義側は" + num);
	}
	void metTest2(int[] array) {
		array[0] += 30;
		System.out.println("定義側は" + array[0]);
	}
}

public class Sample3_8 {
	public static void main(String[] args) {
		int num = 20;
		int[] array = { 20,40 }; //オブジェクト参照型
		RefTest obj = new RefTest();

		obj.metTest1(num);
		System.out.println("呼び出し側は" + num);
		obj.metTest2(array);
		System.out.println("呼び出し側は" + array[0]);
	}
}
