package course13;

import java.util.Scanner;

public class monndai01 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i < 12; i++) {
			System.out.println(i);

		}
		for (int i = 0; i < 10; i++) {
			int y = i % 2;
			if (y == 0) {
				System.out.println("偶数");
			}
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				System.out.println("三週目");

			}
			if (i == 5) {
				System.out.println("あと四週");
			}

			if (i == 9) {
				System.out.println("最後のループ");
			}
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("数値を入力");
		Scanner stdIn = new Scanner(System.in);
		int yy = stdIn.nextInt();
		for (int i = 0; i < yy; i++) {
			System.out.println("現在" + i + "回目のループ");
		}
		int A = stdIn.nextInt();
		for (int i = 0; i < A; i++) {
			if (i == 101) {
				System.out.println("何回回すん");
			}
			int s = i % 2;
			if (s == 0) {
				System.out.println("偶数だよ");
			} else {
				System.out.println("奇数だよ");
			}
		}

	}

}
