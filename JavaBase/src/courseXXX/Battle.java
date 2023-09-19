package courseXXX;

public class Battle {

	String winnmer;

	String doBattle( String poke1, String poke2,String poke3,String poke4,int poke5 ,int  poke6) {
		int ss=1;
		int qq=1;
		System.out.println(poke1+"と"+poke2+"のバトルが始まった");
		if(poke1.equals("ほのお")&&poke2.equals("みず")) {qq=2;}
		if(poke1.equals("みず")&&poke2.equals("ほのお")) {ss=2;}
		if(poke1.equals("ほのお")&&poke2.equals("くさ")) {ss=2;}
		if(poke1.equals("みず")&&poke2.equals("くさ")) {qq=2;}
		if(poke1.equals("くさ")&&poke2.equals("ほのお")) {qq=2;}
		if(poke1.equals("くさ")&&poke2.equals("みず")) {ss=2;}
		if (poke5*ss > poke6*qq) {
			winnmer = "勝ち";

		}else {	winnmer = "負け";}
		return 	winnmer;
	}

}
