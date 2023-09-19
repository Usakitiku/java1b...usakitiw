import java.util.Scanner;

public class tyousenn {

	public static void main(String[] args) {
		System.out.println("アキネーター");
		System.out.println("男性　　女性？");
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();

		int v;

		if (a.equals("男性")) {
			System.out.println("営業職　　エンジニア？");
			v = 1;
		} else {
			System.out.println("営業職　　エンジニア？");
			v = 2;
		}

		int w;
		String b = stdIn.next();

		if (b.equals("営業職")) {
			System.out.println("魚が嫌い　　魚が好き  肉は好き");
			w = 10;
		} else {
			System.out.println("魚が嫌い　　魚が好き　　肉は好き");
			w = 20;
		}
		int x = 0;
		String c = stdIn.next();

		if (c.equals("肉は好き")) {
			System.out.println("夏が好き　　冬が好き");
			x = 300;
		}
		if (c.equals("魚が嫌い")) {
			System.out.println("夏が好き　　冬が好き");
			x = 100;
		}
		if (c.equals("魚が好き")) {

			System.out.println("夏が好き　　冬が好き");
			x = 200;

		}
		int y;
		String k = stdIn.next();

		if (k.equals("夏が好き")) {
			System.out.println("猫派　　犬派");
			y = 1000;
		} else {
			System.out.println("猫派　　犬派");
			y = 2000;
		}
		int z;
		String e = stdIn.next();
		if (e.equals("猫派")) {
			System.out.println("結果は・・・");
			z = 10000;
		} else {
			System.out.println("結果は・・・");
			z = 20000;
		}
		int total = v + w + x + y + z;
		int sas =0;
		
		if (total == 12111) {
			System.out.println("Aさん");
			sas = 10;
		}
		if (total == 22221) {
			System.out.println("Bさん");
			sas = 10;
		}
		if (total == 12311) {
			System.out.println("Cさん");
			sas = 10;
		}
		if (total == 21222) {
			System.out.println("Dさん");
			sas = 10;
		}
		if (total == 21312) {
			System.out.println("Eさん");
			sas = 10;
		}
		

		if (sas == 10) {
			System.out.println(" ");
		} else {
			System.out.println("その他さん");
		}
	}
}
