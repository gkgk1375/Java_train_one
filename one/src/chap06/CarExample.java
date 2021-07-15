package chap06;
//기본적은 클래스의 형태
public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car("검정", 3000);
		
		System.out.println(myCar.name);
		System.out.println(myCar.value);
		
		Car myCar2 = new Car();

	}

}
