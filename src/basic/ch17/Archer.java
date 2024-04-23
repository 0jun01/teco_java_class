package basic.ch17;

public class Archer extends Hero{

	
	
	public Archer(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void attack(Hero heroName) {
		// TODO Auto-generated method stub
		super.attack(heroName);
	}
	
	public void fireArrow() {
		System.out.println(super.name + "파이어 애로우로 공격을 합니다.");
	}
}
