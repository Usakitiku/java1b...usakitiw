package course10;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日");
		String x = stdIn.next();
		System.out.println("時間");
		String y = stdIn.next();
		String z = x + y;
		switch (z) {
		case "月曜午前":
			System.out.println("○");
			break;
		case "火曜午前":
			System.out.println("休診");
			break;
		case "水曜午前":
			System.out.println("○");
			break;
		case "木曜午前":
			System.out.println("○");
			break;
		case "土曜午前":
			System.out.println("○");
			break;
		case "金曜午前":
			System.out.println("休診");
			break;
		case "日曜日午前":
			System.out.println("休診");
			break;
		case "月曜午後":
			System.out.println("○");
			break;
		case "火曜午後":
			System.out.println("○");
			break;
		case "水曜午後":
			System.out.println("○");
			break;
		case "木曜午後":
			System.out.println("○");
			break;
		case "土曜午後":
			System.out.println("○");
			break;
		case "金曜午後":
			System.out.println("○");
			break;
		case "日曜日午後":
			System.out.println("休診");
			break;
		case "月曜間夜":
			System.out.println("○");
			break;
		case "火曜夜間":
			System.out.println("○");
			break;
		case "水曜夜間":
			System.out.println("休診");
			break;
		case "木曜夜間":
			System.out.println("休診");
			break;
		case "土曜夜間":
			System.out.println("○");
			break;
		case "金曜夜間":
			System.out.println("○");
			break;
		case "日曜日夜間":
			System.out.println("休診");
		}
	}
}
