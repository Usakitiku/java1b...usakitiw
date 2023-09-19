package course41;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product pro1 = new Product();
		pro1.no = "A001 ";
		pro1.name = "Item1";
		pro1.Price = 200;
		pro1.quantity = 10;
		pro1.display();
		Scanner stdIn = new Scanner(System.in);
		Food aa = new Food("初期", 0);

		aa.name = stdIn.next();
		aa.price = stdIn.nextInt();
		aa.display();
	}

}
