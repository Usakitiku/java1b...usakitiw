package course25;

public class monndai01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = modorione(134);
		System.out.println(num);
		String moji = modoritwo("文字！");
		int z = modoprathree(333, 555);
		System.out.println(z);
	}

	static int modorione(int a) {
		int num = a + 100;
		return num;
	}

	static String modoritwo(String a) {
		String moji = a + "を受け取りました";
		return moji;
	}

	static int modoprathree(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
