package course33;

public class Trainer {

	private String name;
	String[] test;
	
	Trainer(){
		name = "";
		test = new String[3];
	}
	void caputure(String aaa) {
		test[0] = aaa;
	}
}
