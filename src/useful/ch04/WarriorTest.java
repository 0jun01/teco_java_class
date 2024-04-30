package useful.ch04;

public class WarriorTest {

	public static void main(String[] args) {

		Warrior warrior = Warrior.getInstance();
		System.out.println(warrior);
		// 객체가 한개만 생성되어서 주소값이 똑같음.
		Warrior warrior2 = Warrior.getInstance();
		System.out.println(warrior2);
	}

}
