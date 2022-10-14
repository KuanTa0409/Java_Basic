package loop;

public class whileDemo4{
	public static void main(String[] args) {
		//印出1~10的所有3的倍數並計算其總和
		int i = 1;
		int sum = 0;
		while(i<=10){
			if(i % 3 == 0){
				System.out.println(i);
				sum = sum + i;
			}
			i++;
		}
		System.out.printf("1~10之3的倍數總和: %d\n", sum);
	}
}