package course06;
import java.util.Scanner;
public class monndai01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
System.out.println("文字を入力してね");
Scanner stdIn = new Scanner(System.in);
String moji=stdIn.next();

if(moji.equals("国際理工")) {
	System.out.println("あなたが打ったのは「国際理工」だ！");
	
	}else {
		System.out.println("国際理工じゃ、ないなんて・・・。");
	}

}}
