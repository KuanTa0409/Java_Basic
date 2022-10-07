package decision;

import java.util.Scanner;
public class input3{
	public static void main(String[] args) {
		//雞+兔有35隻,雞腳+兔腳有94隻,求雞、兔各有幾隻?
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入雞+兔共幾隻: ");
		int total = sc.nextInt();
		System.out.println("請輸入雞+兔總腳數: ");
		int feet = sc.nextInt();
		int chicken = ((total*4)-feet)/(4-2);
		int rabbit = total-chicken;
		System.out.printf("雞: %d隻\n兔: %d隻\n", chicken,rabbit);
	}
}