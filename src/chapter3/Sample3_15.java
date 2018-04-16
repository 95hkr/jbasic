package chapter3;

class StaffTs{
	StaffTs(){
		this("佐藤");
	}
	StaffTs(String name){
		System.out.println("名前："+ name);
	}
	void methodM1() {
		System.out.println("メソッドM1");
	}
	void methodM2() {
		this.methodM1();
		System.out.println("メソッドM2");
	}
}

public class Sample3_15 {
	public static void main(String[] args) {
		System.out.println("---- コントラクタ呼び出し ----");
		StaffTs s1 = new StaffTs();
		System.out.println("---- メソッド呼び出し ----");
		s1.methodM2();
	}
}
