package chap06;

public class Car {
	
	//멤버변수2개
	String name;
	int value;
	
	Car(){
		System.out.println("나 카생성자");
	}
	
	//생성자 1개
	Car(String color, int cc){
		name = color;
		value = cc;
	}

}
