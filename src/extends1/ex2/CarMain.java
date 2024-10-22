package extends1.ex2;

public class CarMain {

	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();


		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}

/*상속은 부모의 기능을 자식이 물려받는것.
*  자식이 부모의 기능을 물려받아서 사용할수 있다.
* 반대로 부모 클래스는 자식 클래스에 접근 할수 없다.*/