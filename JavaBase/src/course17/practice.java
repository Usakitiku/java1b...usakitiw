package course17;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int a=13;//10進数
int b=013;//8進数
int c=0x13;//16進数
System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	Scanner stdIn=new Scanner(System.in);
	
	System.out.println("整数：");
int x=stdIn.nextInt();
System.out.printf("１０進数では%dです\n",x);
System.out.printf("%o\n",x);
System.out.printf("%x\n",x);
}}
