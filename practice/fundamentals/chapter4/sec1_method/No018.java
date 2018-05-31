package fundamentals.chapter4.sec1_method;

import java.util.Random;

/*
 * じゃんけんを行うクラスを作成してください。
 * キーボード入力に対して、じゃんけんで「勝ち、負け、あいこ」を表示するプログラムを作成してください。
 */
public class No018 {
	static void jyanken(String x) {
		// ランダムな数字を出す
		Random r = new Random();
		int a = r.nextInt(3);

		// キーボード入力がグーの場合、
		String input = x;
		switch(input) {
		case"グー":
			if(a == 1) {
				System.out.println("グー" + ":" + "あいこ");
			}else if(a == 2) {
				System.out.println("チョキ" + ":" + "あなたの勝ち");
			}else {
				System.out.println("パー" + ":" + "あなたの負け");
			}
			break;

		case"チョキ":
			if(a == 1) {
				System.out.println("グー" + ":" + "あなたの負け");
			}else if(a == 2) {
				System.out.println("チョキ" + ":" + "あいこ");
			}else {
				System.out.println("パー" + ":" + "あなたの勝ち");
			}
			break;
		case"パー":
			if(a == 1) {
				System.out.println("グー" + ":" + "あなたの勝ち");
			}else if(a == 2) {
				System.out.println("チョキ" + ":" + "あなたの負け");
			}else {
				System.out.println("パー" + ":" + "あいこ");
			}
			break;
		}
	}

	public static void main(String[] args) {
		jyanken("パー");
		jyanken("チョキ");
		jyanken("グー");
	}
}

