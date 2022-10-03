package EXP; //這支Java程式在EXP下面

public class Demo1{ //與檔名一樣
	public static void main(String[] args) {
		System.out.println("標準數學運算子~");
		int x=5;
		int y=2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);// 5/2=2
		System.out.println(x % y);// 1
		System.out.println(1 / 2);// 0
		System.out.println(1.0 / 2);// 0.5
		System.out.println(1 / 2.0);// 0.5
		System.out.println(1.0 / 2.0);// 0.5
	}
}
/*
C:\Users\student\JavaCode>javac -encoding utf-8 EXP/Demo1.java

C:\Users\student\JavaCode>java EXP/Demo1
嗨囉~

C:\Users\student\JavaCode>java EXP.Demo1
嗨囉~
*/