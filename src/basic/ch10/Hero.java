package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드를 만들어 주세요
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}
	
	public double getDefense() {
		return this.defense;
	}
	
	public boolean getIsDie() {
		return this.isDie;
	}
	
	// setter
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setHp(int inputHp) {
		this.hp = inputHp;
	}
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	public void setDefense(double inputDenfse) {
		this.defense = inputDenfse;
	}
	public void setIsDie(boolean inputIsDie) {
		// 방어적 코드!
		if(hp <= 0) {
			System.out.println("사망");
		} else {
			System.out.println("현재 남은 HP : "+ hp);
		}
		this.isDie = inputIsDie;
	}
	
	
	

}
