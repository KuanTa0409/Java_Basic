package EXP;

public class Demo3{
	public static void main(String[] args) {
		System.out.println("數學遞增運算子 ++");
		int x = 10;
		int y = ++x;//前序遞增,x先加1後再指派給y
		System.out.printf("x=%d y=%d\n",x,y); //%d放整數-->x=11 y=11

		int a = 10;
		int b = a++;//後序遞增,a先將內容給b後 a再+1
		System.out.printf("a=%d b=%d\n",a,b); //a=11 b=10

		int k = 0;
		System.out.println(k++); //k先印出,再+1-->0
		System.out.println(k); //1
	}
}