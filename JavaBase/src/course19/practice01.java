package course19;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//m1	
		String[] mygroup = new String[10];
		mygroup[1] = "かじまニキ";
		mygroup[2] = "いとうニキ";
		mygroup[3] = "親分";
		//m2
		long[] mygroupnum = new long[10];
		mygroupnum[1] = 9;
		mygroupnum[2] = 1;
		mygroupnum[3] = 5;
		//m3
		int[] myNum = new int[10];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[1] + myNum[0];
		//m4
		Scanner stdIn = new Scanner(System.in);
		int v = stdIn.nextInt();
		int[] my = new int[10];
		my[0] = 10;
		my[1] = v;
		my[2] = my[1] + my[0];
		//m5
		int[] array = new int[10];
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
//m6
			int j=stdIn.hashCode();
		int	[]numarray=new int[j];
		}

	}
}
