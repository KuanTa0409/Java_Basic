package loop;

// break; 跳離迴圈
// continue; 直接進行下一次迴圈

public class whileDemo5{
	public static void main(String[] args) {
	
	int i = 0;
	while(i < 10){
		i++;
		if(i%3 == 0){
			continue;
		}
		if(i == 8){
			break;
		}
		System.out.println(i);
	}
	}
}