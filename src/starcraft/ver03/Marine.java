package starcraft.ver03;

public class Marine extends Unit {


	
	public Marine(String name) {
		super(name); // 부모가 먼저 와야함.
		super.name = name;
		super.power = 4;
		super.hp = 70;
	}





}
