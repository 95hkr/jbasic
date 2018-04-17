package fundamentals.chapter4.sec1_method;
/*
 * int型の「年」「月」「日」を受け取り「XXXX年XX月XX日」という形式の日付を出力するメソッドを定義してください。
 * mainメソッドからそのメソッドを使用していくつか日付を表示させてください。
 */

class Day{
	int time;

	void setTime(int x,int y,int z) {
		time = x;
	}

	int getTime(){
		return time;
	}
}

class No003 {
	public static void main(String[] args) {

		Day s1 = new Day();
		s1.setTime(2020,9,22);

		Day s2 = new Day();
		s2.setTime(2017,11,3);

		System.out.println(s1.getTime());
	}
}
