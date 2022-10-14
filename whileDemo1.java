package loop;

import java.util.Random; //隨機數

public class whileDemo1{
	public static void main(String[] args) {
		
	Random random = new Random(); //建立一個隨機數物件
	while(true){
		int num = random.nextInt(100); //取一個0~99的隨機整數
		System.out.println(num);
		if(num == 27){
			break; //跳出 while 迴圈
			}
		}
	}
}
// 編譯: javac -encoding utf-8 loop/whileDemo1.java
// 執行: java loop/whileDemo1 或 java loop.whileDemo1