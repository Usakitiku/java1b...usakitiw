package course09;

import java.util.Scanner;

public class prk4 {

	public static void main(String[] args) {
		System.out.println("誕生月を入力してください");
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("大吉");
			break;

		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:

			System.out.println("中吉");
			break;
		default:
			System.out.println("雑魚");
			
		}
	
	
	}

}
