package loop;

/*印出每列10顆星星，共3列
**********
**********
**********
*/
public class whileDemo6{
	public static void main(String[] args) {
	//1. 每列印出10顆* 2. 重複3次 3. 兩者合併	
	int x = 1;
	while(x<=3){ //重複3次

	//-------------------------------
	//每列印出10顆*
	int y = 1;
	while(y <= 10){
		System.out.print("*");
		y++;
	}
	System.out.println(); //換行	
	//-------------------------------

	x++;
	}
	}
}
