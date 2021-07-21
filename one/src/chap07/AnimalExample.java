package chap07;

public class AnimalExample {

	public static void main(String[] args) {
		//개체지정
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		
		cat.sound();
		
		System.out.println("----------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		
		animal = new Dog();//자동 타입 변환, Dog를 animal 에게 역으로 상속
		animal.sound();    //재정의된 메소드 호출
		
		animal = new Cat();//Cat을 animal 에게 역으로 상속
		animal.sound();
		System.out.println("----------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		

	}

	private static void animalSound(Animal animal) {
		animal.sound();// 재정의된 메소드 호출
		
		
	}

}
