package course23;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a + b + c;
		int f=50;
				int g=40;
				
		bai(c);
		plus(a, b);
		moji(d);
		niko(f,g);
		System.out.println("呼び出し終わったよ");
	}

	static void plus(int x, int y) {
		System.out.println(x + y);
	}

	static void bai(int s) {
		System.out.println(s);

	}

	static void moji(int e) {
		System.out.println(e);
	}
static void niko(int p,int s){
	System.out.println(p+s);
}
}
