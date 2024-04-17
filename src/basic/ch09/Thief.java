package basic.ch09;

public class Thief {
	
	String thiefName;
	int power;
	int hp;
	int mp;
	
	public Thief(String name, int myPower, int hp) {
		thiefName = name;
		power = myPower;
		hp = 100;
		
	}
	public void showInfo() {
		System.out.println("도적 이름: " + thiefName);
		System.out.println(" HP : " + hp);
		System.out.println(" MP : " + mp);
	}
	public void attackWarrior(Warrior warrior) {
		System.out.println("전사를 " +this.power + "만큼 공격합니다.");
		warrior.beAttacked(this.power);
	}
	
	
	public void beAttacked(int power) {
		if(hp <= 0) {
			System.out.println("이미 죽었습니다.");
			return; //실행에 흐름을 반환
		}
		hp = hp - power;
	}
	
}
