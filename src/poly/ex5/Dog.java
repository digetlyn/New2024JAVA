package poly.ex5;


// implements 구현 (interface를 구현한다.)
public class Dog implements InterfaceAnimal{
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

	@Override
	public void move() {
		System.out.println("개이동 .");
	}
}
