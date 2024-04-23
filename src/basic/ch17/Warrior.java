package basic.ch17;

public class Warrior extends Hero {
	
	
	public Warrior(String name, int hp) {
		super(name,hp);
	}
	
	// 오버라이드
	@Override
	public void attack(Hero heroName) {
		super.attack(heroName);
	}
	
	void comboattack() {
		System.out.println("콤보어택으로 공격 합니다.");
	}
	
}

