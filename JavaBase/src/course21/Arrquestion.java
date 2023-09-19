package course21;

import java.util.Scanner;

public class Arrquestion {

	public static void main(String[] args) {
		int i = 0;
		int b[] = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 124, 141 };
		int a[] = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1, };
		int c[] = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		System.out.println(a[6]);
		for (int p = 0; p < 12; p++) {
			System.out.println(p + 1 + "月の台風は" + a[p] + "件です");
			i++;
		}
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1.地震件数2.台風件数3.降水量");
		int se = stdIn.nextInt();
		System.out.println("1.年別2.月別");
		int ass = stdIn.nextInt();

		int l = 0;
		if (se == 4) {
			for (int p = 0; p < 12; p++) {
				System.out.print(b[p] + ",");
				System.out.print(a[p] + ",");
				System.out.println(c[p] + ",");
		}

		} else {
			if (ass == 1) {
				switch (se) {

				case 1:
					for (int p = 0; p < 12; p++) {
						i++;
						l = l + b[i];
						System.out.println(l);
					}
					break;
				case 2:
					for (int p = 0; p < 12; p++) {
						l = l + a[i];
						System.out.println(a);
					}
					break;
				case 3:
					for (int p = 0; p < 12; p++) {
						l = l + c[i];
						System.out.println(c);
					}
				}
			} else {
				if (ass == 2) {
					System.out.println("何月？");
					int as = stdIn.nextInt();
					switch (se) {
					case 1:
						System.out.println(b[as]);
						break;
					case 2:
						System.out.println(a[as]);
						break;
					case 3:
						System.out.println(c[as]);
					case 4:
						System.out.println();
					}
				}
					
				}
					
				}
			}

		
	}

