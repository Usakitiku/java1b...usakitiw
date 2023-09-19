package course20;

public class practice02 {

	public static void main(String[] args) {
	
		// TODO 自動生成されたメソッド・スタブ
	String[] a={"x","y","x","y","x"};
	int i=0;	
	for(String b:a){
		if(b.equals("x")) {
		i=i+1;
		}}System.out.println(i);

	int d = 0;
	int l = 0;
	String[] f = { "x", "y", "x", "x", "y", "x", "x", "x", "x" };
	for (String o : f) {
		if (o.equals("x")) {
			l = l + 1;
		} else {
			l = 0;
		}

		if (d < l) {
			d = l + 0;
		}

	}
	System.out.println(d);
}
}

