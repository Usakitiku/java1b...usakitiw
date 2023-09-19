package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Student q=new Student();
	q.name="うさ";
	q.no=4;
	Student z=new Student();
	z.name="suzukiのれいや";
	z.no=15;
Student[] myfriend =new Student[2];
myfriend[0]=q;
myfriend[1]=z;	
for (int a=0;a<2;a++) {
	System.out.println(myfriend[a].name+myfriend[a].no);}}

}
