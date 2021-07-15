package chap06;

public class ThisCar {
	//필드
	String model;//전역변수선언
	int speed;
	
	//생성자
	ThisCar(String model) {//지역변수,
		this.model = model;//같은이름을 쓰는 이유는 용도가 같아서
	}    //전역변수를 받음(this 를 쓰기위함은 위에서 선언한 전역변수를 받을 수 있기 때문 
	
	//메소드
	void setSpeed(int speed) {// speed 는 여기서 끝나지만 this.speed 끝까지 감
		this.speed = speed;
	}
	
	void run() {
		for(int i = 1; i<=5; i++) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}                            //전역변수를받음
	}
}
