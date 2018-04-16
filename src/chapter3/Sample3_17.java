package chapter3;

abstract class AbsStaff{ // abstractクラス宣言
	String name = "名無し"; // 通常のメソッドの定義も可能
	String getName() {
		return name;
	}
	abstract int getSalary(); // abstractメソッド
}
class ManagerAbs extends AbsStaff{ // abstractクラスを継承したサブクラス
	int salary = 5000000;
	@Override
	int getSalary() { // abstractメソッドを実装
		return salary;
	}
	@Override
	String getName() {
		return "【マネージャー】" + super.getName();
	}
}

class Sample3_17 {
	public static void main(String[] args) {
		ManagerAbs m1 = new ManagerAbs();
		System.out.println("名前："+ m1.getName());
		System.out.println("給与："+ m1.getSalary());
	}
}
