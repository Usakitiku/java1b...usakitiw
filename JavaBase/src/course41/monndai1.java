package course41;

import java.util.Scanner;

public class monndai1 {

	public static void main(String[] args) {
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);

		int X = 50;
		int Y = 100;
		int Z = X * Y;
		System.out.println(Z);
	
		Scanner stdIn = new Scanner(System.in);
		int pp = stdIn.nextInt();
		System.out.println(pp);

		for (int p = 0; p <= 5; p++) {
			System.out.println(p + "回目のループです");

		}

		
		int ppp = stdIn.nextInt();
		if (ppp >= 50) {
			System.out.println("50以上です");
		} else {
			System.out.println("49以下です");
		
		}
		
		
		boolean isRaining = true;
		if (isRaining == true) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い1日を！");
		}
	
		int[] numArr = new int[5];
		numArr[0] = 10;
		numArr[1] = 50;
		numArr[2] = 30;
		numArr[3] = 20;
		numArr[4] = 40;

		
		for (int i = 0; i <= 4; i++) {
			System.out.println(numArr[i]);
		}
	
	int q=0;
	for(int b = 0; b <= 4; b++) {
		
		if (numArr[b]>q) {
		
			q=numArr[b];
		
		}else {}
	
	}
	
	int x=stdIn .nextInt();
	int [] variable=new int[x];
	
	int [] numExArr=new int[5];
	int C=1;
	numExArr[0]=10;
	numExArr[1]=20;
	numExArr[2]=30;
	numExArr[3]=40;
	numExArr[4]=50;
	int ba=0;
	
for(int c=4;c<=0; c++) {
	
		numExArr[c]=ba;
		numExArr[c-4]=numExArr[c];
		
	}
	
	
	mogi1();
	
	
	int D=10;
	int E=11;
	calc(D,E);
	
String XX=	mojicon("今のところ全問正解でしょ？");

	}

	static void mogi1() {
		System.out.println("メソッド問題");
	}
	static void calc(int a,int b) {
		System.out.println(a+b);
	}

	static String mojicon(String a) {
		String concated = a + "を受け取りました";
		return concated;
	}



}

