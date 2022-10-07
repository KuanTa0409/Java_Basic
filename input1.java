package decision; //package名稱要小寫(約定成俗)

import java.util.Scanner;

public class input1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //建立一個Scanner的物件
		System.out.print("請輸入半徑?");
		int r = sc.nextInt(); //將使用者所輸入的資料轉成int後 再給變數r使用
		System.out.printf("使用者所輸入的半徑是: %d\n",r);
		double area = r * r * Math.PI; //Math.PI指的就是圓周率3.14159...
		System.out.printf("圓面積: %.1f\n",area); //圓面積: 205887.4
		System.out.printf("圓面積: %,.1f\n",area); //圓面積: 205,887.4(多千分號)

	}
}