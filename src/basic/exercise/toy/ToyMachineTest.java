package basic.exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		System.out.println("---- 상품 구성 ----");
		ToyMachine doll1 = new LionDoll();
		ToyMachine doll2 = new BearDoll();
		ToyMachine doll3 = new Airpods();

		doll1.showInfo();
		doll2.showInfo();
		doll3.showInfo();

		System.out.println("-------------------");

		ToyMachine[] toyMachines = new ToyMachine[3];
		toyMachines[0] = doll1;
		toyMachines[1] = doll2;
		toyMachines[2] = doll3;
		final int START = 1;
		final int END = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("인형뽑기를 시작하려면 1번을 누르세요");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == START) {
				for (int i = 0; i < toyMachines.length; i++) {
					
					if (toyMachines[i] instanceof Airpods) {
						((Airpods) toyMachines[2]).drawProduct();
					} else if (toyMachines[i] instanceof BearDoll) {
						((BearDoll) toyMachines[1]).drawProduct();
					} else if (toyMachines[i] instanceof LionDoll) {
						((LionDoll) toyMachines[0]).drawProduct();
					} else {
						System.out.println("아무것도 못 뽑았다");
					}

				}
			} else if (choice == END) {
				System.out.println("안할꺼야");
				return;
			} else {
				System.out.println("종료하려면 0번 시작하려면 1번을 누르세요");
			}
		}
	}

}
