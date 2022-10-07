package decision;

import java.util.Scanner;
public class input7{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("請輸入身分證第二碼: ");
		int code = sc.nextInt();

		switch(code){
			case 1:
				System.out.println("男性");
				break;
			case 2:
				System.out.println("女性");
				break;
			case 8:
				System.out.println("外來人口-男性");
				break;
			case 9:
				System.out.println("外來人口-女性");
				break;
			default:
				System.out.println("錯誤");
		}
		//判斷本國人或外地人
		switch(code){
			case 1:
			case 2:
				System.out.println("本國人");
				break;
			case 8:
			case 9:
				System.out.println("外地人");
				break;
			default:
				System.out.println("錯誤");
		}
	}
}