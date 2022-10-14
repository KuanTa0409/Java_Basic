package loop;

import java.util.Scanner;
import java.util.Random;
public class UserVSPc_GuessNum{
	public static void main(String[] args) {
	Random random = new Random();
	int ans = random.nextInt(99)+1; //(0~98)+1 
	int min = 0,max = 100;
	do {
		//user 猜
		Scanner scanner = new Scanner(System.in);
		System.out.printf("user請在 %d~%d 之間猜一數字: ", min, max);
		int userGuess = scanner.nextInt();

		//檢查 userGuess 是否合理?
		if(userGuess >= max || userGuess <= min){
			System.out.println("數字範圍錯誤! 請重新猜~");
			continue;
		}

		// 判斷 user 是否有猜中?
		if(userGuess < ans){
			min = userGuess;
		}else if(userGuess > ans){
			max = userGuess;
		}else {
			System.out.println("user答對了阿!!!");
			break;
		}
		// pc猜
		int pcGuess = random.nextInt(max - min - 1) + min + 1;
		System.out.printf("pc請在 %d~%d 之間猜一數字: %d\n", min, max, pcGuess);
		if(pcGuess < ans) {
			min = pcGuess;
		} else if(pcGuess > ans) {
			max = pcGuess;
		} else {
			System.out.println("pc答對了阿!!!");
			break;
		}

	} while(true); //先把外在結構寫出來再佈局裡面
	}
}