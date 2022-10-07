package decision;

import java.util.Scanner;
public class input2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入成績: ");
		int score = sc.nextInt();

		//成績判斷
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}
