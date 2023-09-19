package course57;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int a = 0;
		int b = 0;
		int ransu = rnd.nextInt(100) + 1;
		while (a!=ransu) {
			b++;
			System.out.println("数入れろ");
			a = stdIn.nextInt();
			
			if (a == ransu) {
				System.out.println("クリア");
			} else if (a > ransu) {
				System.out.println("入力した値より低いよ");
			} else {
				System.out.println("入力した値より大きいよ");
			}
		}
		System.out.println("クリアにかかった回数" + b + "回");
	}
}
