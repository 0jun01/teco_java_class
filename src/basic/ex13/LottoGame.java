package basic.ex13;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		int reRoll1 = 0;
		int reRoll2 = 0;
		int reRoll3 = 0;
		int reRoll4 = 0;
		int reRoll5 = 0;
		int tempBox = 0;
		for (int i = 1; i <= 6; i++) {
			if (gameNumber1 == gameNumber2) {
				reRoll1 = LottoNumberMaker.makeNumber();
				gameNumber1 = reRoll1;
			}

			if (gameNumber1 > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}
			if (gameNumber2 == gameNumber3) {
				reRoll2 = LottoNumberMaker.makeNumber();
				gameNumber2 = reRoll2;
			}
			if (gameNumber2 > gameNumber3) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}
			if (gameNumber3 == gameNumber4) {
				reRoll3 = LottoNumberMaker.makeNumber();
				gameNumber3 = reRoll3;
			}
			if (gameNumber3 > gameNumber4) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber4 == gameNumber5) {
				reRoll4 = LottoNumberMaker.makeNumber();
				gameNumber4 = reRoll4;
			}

			if (gameNumber4 > gameNumber5) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}

			if (gameNumber5 == gameNumber6) {
				reRoll5 = LottoNumberMaker.makeNumber();
				gameNumber5 = reRoll5;
			}

			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
			}

		}

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	} // end of main

} // end of class
