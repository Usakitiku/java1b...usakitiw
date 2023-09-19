package course33pair;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		if (a <= 50) {
			System.out.println("50以上です");
		} else {
			if (a > 50) {
				System.out.println("49以下です");
			}
		}
	}

}
