package course22;

import java.util.Arrays;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int[][] a=new int[3][3];
a[0][0]=10;
a[0][1]=20;
a[0][2]=30;
a[1][0]=40;
a[1][1]=50;
a[1][2]=60;	
a[1][0]=70;
a[1][1]=80;
a[1][2]=90;
System.out.println(a[1][0]);
System.out.println(a[1][2]);	
if (a[1][0] > 50) {
	System.out.println("大きいです");
}
System.out.println(a[1][1]+a[1][2]);
System.out.println(Arrays.deepToString(a));
	}
}
