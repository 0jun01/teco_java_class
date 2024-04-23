package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {

		String[] arrayStr = new String[26];
		
		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";
		arrayStr[25] = "Y";
		
		int forCount = 0;
		int eCount = 0;
		for(int i = 0 ; i < arrayStr.length ; i++) {
			if(arrayStr[i] != null) {
				eCount++;
			}
			forCount++;
		}
		System.out.println("배열의 총 개수 : " + forCount);
		System.out.println("요소의 총 개수 : " + eCount);
		
		// 반복문 활용
		// 배열안에 요소의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력
		
	}

}
