package basic.ex13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();

		int randomBox1 = gameNumber1;

		int randomBox2 = gameNumber2;
		int emptyBox;
		/*
		 * int gameNumber3 = LottoNumberMaker.makeNumber(); int gameNumber4 =
		 * LottoNumberMaker.makeNumber(); int gameNumber5 =
		 * LottoNumberMaker.makeNumber(); int gameNumber6 =
		 * LottoNumberMaker.makeNumber();
		 */

		// System.out.print(gameNumber1 + "\t");
		// System.out.print(gameNumber2 + "\t");
		/*
		 * System.out.print(gameNumber3 + "\t"); System.out.print(gameNumber4 + "\t");
		 * System.out.print(gameNumber5 + "\t"); System.out.print(gameNumber6 + "\t");
		 */

		// 에상
		if (randomBox1 > randomBox2) {
			emptyBox = randomBox1;
			randomBox1 = randomBox2;
			randomBox2 = emptyBox;
		}
		System.out.println();
		System.out.println("------------------");
		System.out.println(randomBox1);
		System.out.println(randomBox2);

	} // end of main

} // end of class
