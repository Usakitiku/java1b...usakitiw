package course47;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		try {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("数値をにゅうりょくしてね");
			int x = stdIn.nextInt();
			int[] numArry = new int[3];
			numArry[1] = 10;
			numArry[2] = 20;
			numArry[3] = 30;
			numArry[4] = 40;
		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐるべし！！！");
			System.out.println(e);}
	}
}
