package basic.ch09;

public class Warrior {

	int hp;
	int mp;
	int attackPower;
	double armorPower;
	int warriorMoney; // 보유한 돈
	int warriorLevel;
	String warriorName;
	
	public Warrior(String myName, int myMoney, int myPower) {
		warriorName = myName;
		warriorMoney = myMoney;
		attackPower = myPower;
		hp = 100;
	}
	
	public void showInfo() {
		System.out.println("전사 이름 : " + warriorName + "입니다.");
		System.out.println("현재 보유한 돈은 : " + warriorMoney +"입니다." );
		System.out.println("레벨: "+warriorLevel  );
		hp = hp + warriorLevel ;
		mp = mp + warriorLevel ;
		System.out.println("HP : " + hp);
		System.out.println("MP : " + mp);
		System.out.println("공격력 : " + attackPower );
	}
	public void meetThief(Thief thief) {
		System.out.println(thief.thiefName +"에게 소매치기 당했습니다.");
		warriorMoney -= 10000;
		System.out.println("현재 보유한 돈은 : " + warriorMoney +"입니다.");
		System.out.println("쫓아가 싸우기 [1] 보내주기 [2]을 눌러주세요.");
	}
	
	public void attackThief(Thief thief) {
		System.out.println("도적을 공격(" + this.attackPower + ") 합니다");
		thief.beAttacked(this.attackPower);
	}
	public void beAttacked(int power) {
		if(hp <= 0) {
			System.out.println("이미 죽었습니다.");
			return;
		} 
		hp = hp - power;
	}
	
	
	
	
}
