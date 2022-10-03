package EXP;

public class Demo6{
	public static void main(String[] args) {
		int h=170;
		int w=60;
		
		//印出 bmi=20.76
		//h=h/100;   -->h=1
		//h=h/100.0; -->error
		//double n = h/100; -->n=1.0
		double m = h/100.0; //m=1.7
		System.out.println(m);

		double bmi = w / (m*m);
		System.out.printf("BMI:%.2f\n", bmi);

		//判斷bmi是否正常?
		//bmi正常範圍在 18<=bmi<23
		System.out.printf("BMI:%.2f，是否正常? %b\n", bmi,((bmi>=18) && (bmi<23)) );
	}
}