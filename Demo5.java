package EXP;

public class Demo5{
	public static void main(String[] args) {
		int score = 80;
		//請問score是否及格?
		System.out.printf("分數%d，score是否及格? %b\n",score,score>60);

		//請問 score是否為偶數?
		System.out.printf("分數%d，score是否為偶數? %b\n",score,score%2==0);

		//請問 score是否同時及格且偶數?
		System.out.printf("分數%d，score是否同時及格且為偶數? %b\n",score,(score>=60)&&(score%2==0));
	}
}