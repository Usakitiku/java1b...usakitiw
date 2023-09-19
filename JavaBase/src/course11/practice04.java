package course11;

public class practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;

		while (i <= 100) {
			System.out.println(i);
			int z = i % 10;
			if (z == 0 && i != 0) {
				System.out.println(i + "の倍数です");
			}
			i++;
		}
	}

}
