package ksopa;

import java.util.Scanner;

public class use {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		name na = new name();
		int c = 0;
		na.name[0] = stdIn.next();
		na.pow[0] = stdIn.nextInt();
		int aa = bb(c);
		na.vs();
		cd(aa);
	}
	
	static void aaaa() {
		System.out.println("a");
	}

	static int bb(int a) {
		int z = 1;
		z = z + a;
		return z;
	}

	static void cd(int a) {
		System.out.println(a);
	}
}
