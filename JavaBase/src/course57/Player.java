package course57;

public class Player {
	private int kin;
	private int ben;
	private int gaku;
	private int mit;

	public int getKin() {
		return kin;
	}

	public void setKin(int kin) {
		this.kin = kin;
	}

	public int getBen() {
		return ben;
	}

	public void setBen(int ben) {
		this.ben = ben;
	}

	public int getGaku() {
		return gaku;
	}

	public void setGaku(int gaku) {
		this.gaku = gaku;
	}

	public int getMit() {
		return mit;
	}

	public void setMit(int mit) {
		this.mit = mit;
	}

	public void para() {
		System.out.println();
		System.out.println("貴方の筋力は" + kin + "ですわ～");
		System.out.println("貴方の学力は" + ben + "ですわ～");
		System.out.println("貴方の外見は" + mit + "ですわ～");
		System.out.println("貴方の人望は" + gaku + "ですわ～");
	}
	
}
