package starcraft.ver01;

public class StarCraftTest1 {

	public static void main(String[] args) {

		// 질럿 2
		Zealot zealot1 = new Zealot("질럿");
		Zealot zealot2 = new Zealot("드라군");
		
		// 마린 2
		Marine marine1 = new Marine("마린");
		Marine marine2 = new Marine("고스트");

		// 저글링 2
		Zergling zergling1 = new Zergling("저글링");
		Zergling zergling2 = new Zergling("히드라");

		for (int i = 0; i < 15; i++) {
			zealot1.attackMarine(marine2);
		}
		marine2.showInfo();
	}

}
