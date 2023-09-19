package course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		Pcketon pock1 = new Pcketon();
		pock1.name = "銭ガメ";
		pock1.power = 100;
		pock1.difficult = 1;
		pock1.display();

		Pcketon pock2 = new Pcketon();
		pock2.name = "不思議のリーフ";
		pock2.power = 200;
		pock2.difficult = 3;
		Pcketon pock3 = new Pcketon();

		pock3.name = stdIn.next();
		pock3.power = stdIn.nextInt();
		pock3.difficult = stdIn.nextInt();

		Pcketon[] myPockes = new Pcketon[3];
		myPockes[0] = pock1;
		myPockes[1] = pock2;
		myPockes[2] = pock3;
		String[] arr2 = new String[3];
		arr2[0] = "あ";
		arr2[0] = "か";
		arr2[0] = "さ";
		System.out.println(myPockes[2].name + myPockes[2].power + myPockes[2].difficult);
		System.out.println(myPockes[1].difficult);
		for (int a = 0; a < 3; a++) {
			System.out.println(myPockes[a].name);
		}
		for (int a = 0; a < 3; a++) {
			System.out.println(arr2[a]);
		}
		myPockes[1].display();
	}

}
