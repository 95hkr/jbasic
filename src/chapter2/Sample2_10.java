package chapter2;

public class Sample2_10 { // クラスブロック START
	int x = 2;
	void add() {
		int y =5;
		System.out.println(x + y);
	}
	void scopeSample() {
		for(int i = 0; i < x; i++) {
			System.out.println(i);
			// System.out.println(y);
		}
	}
} // クラスブロック END
