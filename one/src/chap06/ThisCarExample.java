package chap06;

public class ThisCarExample {

	public static void main(String[] args) {
		ThisCar myCar = new ThisCar("포르쉐");//new 를 붙힌 이유는 다른 메모리를 만들기위해(구분하기위함)
		
		ThisCar yourCar = new ThisCar("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
