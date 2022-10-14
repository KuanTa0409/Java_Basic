package loop;

public class whileDemo2{
	public static void main(String[] args) {
		//利用 while-loop 印出1~10並計算總合
		int i = 1;
		int sum = 0;
		while(true){
			System.out.println(i);
			sum +=i; //sum = sum + i > sum進行累加
			i++;
			if(i > 10){ //若i>10 則跳出while迴圈
				break;
			}
		}
		System.out.printf("總和= %d\n",sum);
	}
}
/*
int i=1;
int sum=0;
while(i<11){
	sum=sum+i;
	i++;
}
System.out.println("總和:"+sum);
*/