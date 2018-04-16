package fundamentals.chapter2.sec7_switch;

/*
 * 点数が80点以上、60点以上、40点未満で表示結果を分けるプログラムをswitch文を使用して作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		int i = 55;
		switch(i) {
		case 1:
			System.out.println("80点以上");
			break;
		case 2:
			System.out.println("60点以上");
			break;
		default:
			System.out.println("40点未満");
		}
	}
}
