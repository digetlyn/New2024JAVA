package poly.ex6;


//abstract 이걸 붙이면 추상 클래스가 된다.
public abstract class AbstractAnimal {

	public abstract void sound();  //추상 목적
	public void move() {			//상속을 목적
		System.out.println("동물이 움직인다.");
	}
}
