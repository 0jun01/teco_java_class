package starcraft.ver03;

public class StarcraftTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling = new Zergling("저글링1");

		zealot1.showInfo();
		marine1.showInfo();
		zergling.showInfo();
		System.out.println("-----------");
		zealot1.attack(marine1);
		zergling.attack(marine1);

		marine1.showInfo();

	} // end of main

} // end of class