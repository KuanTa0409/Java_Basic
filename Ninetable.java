package loop;

public class Ninetable{

	public static void main(String[] args) {
		for(int x=1;x<=9;x++){

		for(int y=1 ; y<=9 ; y++){
			System.out.printf("%2d*%d=%2d  ", x, y, (x*y)); //%2d 整數佔2格放
		}
		System.out.println();

	 	}
	}
}