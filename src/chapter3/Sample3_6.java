package chapter3;

class FinTest {
	final int a = 15;
	static final int b = 25;
	static int c = 35;
	int d = 45;
	int e;

	void method(){
		int f;
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("c" + c);
		System.out.println("d" + d);
		System.out.println("e" + e);
		//System.out.println("f" + f);

	}
}

public class Sample3_6 {
	public static void main(String[] args) {
		// FinTest.b-50; //bはfinalなので変更不可です
		FinTest.c = 50; //cは変更可能

		FinTest f = new FinTest();
		f.method();
	}
}
