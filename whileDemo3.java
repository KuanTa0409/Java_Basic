package loop;

public class whileDemo3{
	public static void main(String[] args) {
		// 印出1~10並求出總和
		int i = 0;
		int sum = 0;
		while(i <= 10){
			System.out.println(i);
			//sum += i++; 表示先sum += i 再i++
			sum += i;
			i++;
		}
		System.out.printf("總和: %d\n",sum);
	}
}