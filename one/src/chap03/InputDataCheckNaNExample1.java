package chap03;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		String userInput = "NaN"; // 5 % 0.0
		//여기서의 NaN은 문자열이지만
		double val = Double.valueOf( userInput );
		//여기서의 NaN은 값임
		double currentBalance = 10000.0;
		
		currentBalance =+ val; 
		//만약 10000 + NaN 연산하면 결과가 뭐가나올것이냐
		System.out.println(currentBalance);
		//NaN에다가 어떤 숫자를 계산해도 NaN이 나옴

	}

}
