package decision;

import java.util.Scanner;
public class input6{
	public static void main(String[] args) {
		//判斷輸入的數字是偶數還是奇數?
		System.out.println("請輸入一個數: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//case 1:利用if-else 判斷奇偶數
		if(num % 2 == 0){
			System.out.println("偶數");
		}else{
			System.out.println("奇數");
		}
		//case 2:利用三元運算子(?:) 判斷奇偶數
		System.out.println( (num % 2 == 0) ? "偶數" : "奇數" );
	}
}