package course40;

import java.util.Scanner;

public class mon {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 15;
		if (number > 10) {
			System.out.println("でか！！！");
		}

		int age = 20;
		if (age >= 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだねｗ");
		}
		int score = 85;
		if (score >= 90) {
			System.out.println("Excellent");
		} else {
			if (score >= 80 && score < 90) {
				System.out.println("Good");
			} else {
				System.out.println("勉強しよう");
			}

		}

		boolean isEaining = true;
		if (isEaining == true) {
			System.out.println("傘持ってけーーー");
		} else {
			System.out.println("よい一日を");
		}

		Scanner stdIn = new Scanner(System.in);
		int num2 = stdIn.nextInt();
		num2 = num2 % 2;
		if (num2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数だよ");
		}

		for (int a = 1; a < 11; a++) {
			System.out.println(a);
		}
		int dc = 0;
		for (int b = 0; b < 101; b++) {
			dc = b % 2;
			if (dc == 0) {
				System.out.println("現在" + b + "回目のループです。偶数です。");
			} else {
				System.out.println("現在" + b + "回目のループです。奇数です。");
			}

		}

		for (int c = 10; c > 0; c--) {
			System.out.println(c);
		}

		int sum3 = 0;
		for (int d = 1; d < 101; d++) {
			sum3 = sum3 + d;
		}
		System.out.println(sum3);
		int[] number2 = new int[5];
		number2[0] = 10;
		number2[1] = 20;
		number2[2] = 30;
		number2[3] = 40;
		number2[4] = 50;
		for (int e = 0; e < 5; e++) {
			System.out.println(number2[e]);
		}

		String[] cities = new String[5];

		cities[0] = "東京";
		cities[1] = "大阪";
		cities[2] = "千葉";
		cities[3] = "神奈川";
		cities[4] = "埼玉笑";

		for (int e = 1; e < 5; e++) {
			System.out.println(cities[e]);
		}

		int[] numbers3 = new int[5];
		numbers3[0] = 10;
		numbers3[1] = 20;
		numbers3[2] = 30;
		numbers3[3] = 40;
		numbers3[4] = 50;
		int saa = numbers3[1] + numbers3[2] + numbers3[3] + numbers3[4] + numbers3[0];
		System.out.println(saa);
		int d = 0;
		for (int a = 0; a < 5; a++) {

			if (numbers3[a] > d) {
				d = numbers3[a];
			}

		}
		System.out.println(d);
		int[] number4 = new int[5];
		number4[0] = 11;
		number4[1] = 20;
		number4[2] = 31;
		number4[3] = 50;
		number4[4] = 51;
		for (int a = 0; a < 5; a++) {
			int s = number4[a] % 2;
			if (s == 0) {
			} else {
				System.out.println(number4[a]);
			}
		}

		PrintHello aaa = new PrintHello();
		System.out.println(aaa.a);

		
		printHello();
		int q = 2;
		int f = 4;
		multiply(q, f);
	int dsds=	multiplymodori(q,f);
		System.out.println(dsds);
	
	boolean qqq=isEven(q);
	System.out.println(qqq);
	
	String z="こんにちわ";
	String moji = getGreeting(z);
	System.out.println(moji);
	
	}

	static void printHello() {
		System.out.println("Hello, World!");
	}

	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	static int multiplymodori(int a, int b) {
		int x = a * b;
		return x;
	}

	static boolean isEven(int ft) {
		boolean c = false;
		int number = ft % 2;
		if (number == 0) {
			c = true;
		}
		return c;
	}

	static String getGreeting(String z) {
		String nameme = z + "ああああああ";
		return nameme;
	}
}
