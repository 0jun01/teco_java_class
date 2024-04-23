package basic.ch17;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack(Hero heroName) {
		System.out.println(heroName + "을 공격합니다.");
	}

}

	
	

