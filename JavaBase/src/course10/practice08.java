package course10;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
int x=stdIn.nextInt();
int y=stdIn.nextInt();
int z=stdIn.nextInt();
if(x>y) {
	if(y>z) {
System.out.println(x+"が1番大きい数値です");		
System.out.println(y+"が2番大きい数値です");		}
	System.out.println(z+"が3番大きい数値です");		
	if(y>z) {
		System.out.println(x+"が一番大きい数値です");		
		System.out.println(y+"が3番大きい数値です");		
	System.out.println(z+"が2番大きい数値です");	}

}
	if(x<y) {
		if(x>z) {
	System.out.println(y+"が1番大きい数値です");		
	System.out.println(x+"が2番大きい数値です");		}
		System.out.println(z+"が3番大きい数値です");		
		if(x<z) {
			System.out.println(y+"が一番大きい数値です");		
			System.out.println(x+"が3番大きい数値です");		
		System.out.println(z+"が2番大きい数値です");	}
	}
	
		
		if(x<z) {
			if(x>y) {
		System.out.println(z+"が1番大きい数値です");		
		System.out.println(x+"が2番大きい数値です");		}
			System.out.println(y+"が3番大きい数値です");		
			if(x<y) {
				System.out.println(z+"が一番大きい数値です");		
				System.out.println(y+"が3番大きい数値です");		
			System.out.println(x+"が2番大きい数値です");	}
				
		
}


	}

}
