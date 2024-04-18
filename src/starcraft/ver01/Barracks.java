package starcraft.ver01;

public class Barracks {

	private int barracksNumber;
	private int count;
	
	public Barracks(int barracksNum) {
		barracksNumber = barracksNum;
		count = 0;
	}
	
	public int getBarracksNumber() {
		return this.barracksNumber;
	}
	public int getCount() {
		return this.count;
	}
	
	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}
}
