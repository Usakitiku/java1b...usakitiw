package course35;

import java.util.Scanner;

public class sample01r {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		
	
		
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();

		if (x > 49) {
			int y = stdIn.nextInt();
			calc(x, y);
		} else {
		calc(x);
		}

	}

	static void calc(int a, int b) {
System.out.println(a+b);
	}

	static void calc(int a) {
		System.out.println(a*10);
	}

}
