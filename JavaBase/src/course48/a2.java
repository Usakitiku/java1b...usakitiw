package course48;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[][] r = new int[6][6];

	
		for (int c = 1; c <= 6; c++) {
			for (int b = 1; b <= 6; b++) {
				r = m(c, b, r);

				
			}
		}
		System.out.println(r[5][4]);
	}

	static int[][] m(int a, int b, int[][] c) {
		Scanner stdIn = new Scanner(System.in);
		int[][] ss = new int[0][0];
		ss = new int[a][b];
		ss[a - 1][b - 1] = stdIn.nextInt();
			int[][] r = new int[6][6];
			r[a - 1][b - 1] = ss[a - 1][b - 1];
			return r;

	}
}
