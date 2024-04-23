package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp); // 부모 생성자 호출
	}

	
	
	@Override
	public void attack(Hero heroName) {
		// TODO Auto-generated method stub
		super.attack(heroName);
	}

	void freezing() {
		System.out.println("프리징으로 공격을 합니다.");
	}
}
