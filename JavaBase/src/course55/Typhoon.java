package course55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	//デフォルトコンストラクタ
	public Typhoon(){
		System.out.println("a");
	}
	
	public Typhoon(int a,String b,String c) {
		this.typhoonbango=a;
		this.hasseibi=b;
		this.asiaName=c;
	}//引数有りコンストラクタ
	//getter,setter

	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}

	
}
