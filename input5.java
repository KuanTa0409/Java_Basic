package decision;

import java.util.Scanner;
/*--------------------
 * 設計一個BMI計算機
 *--------------------
 * 請輸入身高(cm):
 * 請輸入體重(kg):
 * BMI值:
 * 判斷結果:
 *--------------------
 * 正常:18<= BMI <23
 * 過瘦:18< BMI
 * 過胖:BMI >23
 *--------------------
 */
public class input5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高(cm): ");
		double h_cm = sc.nextDouble();
		System.out.print("請輸入體重(kg): ");
		double w_kg = sc.nextDouble();
		double h_m = h_cm / 100; //cm > m
		
		double bmi = w_kg / Math.pow(h_m , 2); //h_m的平方
		System.out.printf("BMI值: %.2f\n", bmi);

		if(bmi >= 23){
			System.out.printf("BMI=%.2f是 過胖",bmi);
		}else if(bmi < 18){
			System.out.printf("BMI=%.2f是 過輕",bmi);
		}else {
			System.out.printf("BMI=%.2f是 正常",bmi);
		}
		/*
		if(bmi >= 18 && bmi < 23){
			System.out.printf("BMI=%.2f是正常",bmi);
		}else if(bmi < 18){
			System.out.printf("BMI=%.2f是過輕",bmi);
		}else if(bmi >= 23){
			System.out.printf("BMI=%.2f是過胖",bmi);
		}
		*/
	}
}