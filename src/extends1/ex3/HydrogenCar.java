package extends1.ex3;

public class HydrogenCar extends Car{

	public void fillHydrogen(){
		System.out.println("수소를 충전합니다.");
	}
}

// Car를 상속받은 덕분에 move(), openDoor() 와 같은 기능을 바로 사용할수 있다.
