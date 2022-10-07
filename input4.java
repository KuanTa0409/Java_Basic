package decision;

import java.util.Scanner;
/*-----------------------------------------
 * score 應介於0 ~ 100 之間
 *-----------------------------------------
 * score >= 90 && score <=100 印出 A
 * score >= 80 && score < 90  印出 B
 * score >= 70 && score < 80  印出 C
 * score >= 60 && score < 70  印出 D
 * score >= 0  && score < 60  印出 E
 *-----------------------------------------
 * 若 score > 100 或 score < 0 則印出分數錯誤
 *-----------------------------------------
 */
public class input4{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = sc.nextInt();
		
		if (score >= 90 && score <= 100){
			System.out.println("A");
		}else if (score >= 80 && score < 90){
			System.out.println("B");
		}else if (score >= 70 && score < 80){
			System.out.println("C");
		}else if (score >= 60 && score < 70){
			System.out.println("D");
		}else if (score >= 0  && score < 60){
			System.out.println("E");
		}else{
			System.out.println("分數輸入錯誤");
		}
	}
}