package fundamentals.chapter2.sec4_operator;
/*
 *以下のプログラムは、a～eの5つの変数にそれぞれ初期値を与え、様々な演算を施したのち、コンソール画面にその値を表示したものです。
 *このプログラムの7行目から11行目を、全く同じ計算になるような代入演算子による計算に変え、結果が全く同じになるようにプログラムを書き換えてください。
 */
public class No001 {
	public static void main(String[] args){
        int a = 1,b = 2,c = 3,d = 4,e = 5;

        a += 2;
        b -= 1;
        c *= 3;
        d /= 2;
        e %= 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
