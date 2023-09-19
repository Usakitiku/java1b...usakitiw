package course22;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int s=0;
		String[][] a = { { "0", "x", "0" }, { "X", "0", "X" }, { "0", "0", "0" } };
		System.out.println(a[2][1]);
		System.out.println(Arrays.deepToString(a));
		for (int i = 0; i < 3; i++) {
			for (int f = 0; f < 3; f++) {
			if(a[i][f].equals("0")) {s++;}
			}
		}

	System.out.println(s);}

}
