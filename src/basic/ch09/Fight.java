package basic.ch09;

import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("타락파워전사", 10000, 10);
		warrior1.showInfo();
		Thief thief1 = new Thief("아루루", 2, 5);
		
		warrior1.meetThief(thief1);
		Scanner sc = new Scanner(System.in);
		int fight = sc.nextInt();
			if(fight == 1) {
				System.out.println("전투가 시작됩니다.");
				for(int i = 1 ; i <= fight; i++) {
					warrior1.attackThief(thief1);
				}
			} else {
				System.out.println("놓아주었습니다.");
				return;
			}
	}

}
