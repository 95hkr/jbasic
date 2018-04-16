package chapter3;

interface Work{
	void met1();
}
class WorkImp implements Work{
	@Override
	public void met1() {
		System.out.println("事務処理");
	}
	public void met2() {
		System.out.println("外回り");
	}
}

class Sample3_18 {
	public static void main(String[] args) {
		Work w1 = new WorkImp();
		w1.met1();
		// w1.met2(); コンパイルエラー
		WorkImp wi1 = (WorkImp)w1;
		wi1.met2();
	}
}
