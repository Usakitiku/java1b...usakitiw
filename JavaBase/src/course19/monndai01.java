package course19;

public class monndai01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[5];

		array[0] = 100;
		array[1] = 50;
		array[2] = 75;
		array[3] = 80;
		array[4] = 65;

		for (int a = 0; a <= 101; a++) {
			for (int d = 0; d < 5; d++) {
				int vv = array[d];
				if (vv == a) {
					System.out.println(a);

				}

			}
		}
	}
}