package EXP;

public class Demo2{
	public static void main(String[] args) {
		System.out.println("計算BMI: ");
		double w = 60; //double會自動補0--> 60.0
		double h = 170; //170.0
        //將h/100轉換為公尺
        h = h / 100;
		
		double bmi = w / (h*h);
		System.out.println(bmi);

		//若只要印出小數點2位，可以用printf()
		System.out.printf("%f\n", bmi); //%f　放一個(%) 浮點數(f)
		System.out.printf("%.2f\n", bmi); //小數點2位
		System.out.printf("%.1f\n", bmi); //小數點1位

		//想要印出 "bmi = 20.76"
		System.out.printf("bmi = %.2f\n", bmi);

		//用克漏字挖洞填-->想要印出 "身高=170.0cm 體重=60.0kg BMI=20.76"  
		System.out.printf("身高=%.1fcm 體重=%.1fkg BMI=%.2f\n",(h*100),w,bmi);
	}
}