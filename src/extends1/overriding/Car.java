package extends1.overriding;


//여기가 부모 클래스가 된다.
public class Car {

	public void move() {
		System.out.println("차를 이동합니다.");
	}

	//디른 자동차의 기능을 추가
	public  void openDoor(){
		System.out.println("자동차 문을 엽니다.");
	}

}


