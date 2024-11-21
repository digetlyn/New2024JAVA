package poly.ex6;



public class SoundFlyMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();

		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);

		flyAnimal(bird);
		flyAnimal(chicken);
		//flyAnimal(dog); //얘는안된다. 부모에 추상 AbstractAnimal만 있다.
	}

	//AbstractAnimal 사용가능
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작 ");
		animal.sound();
		System.out.println("동물 소리 테스트 종료 ");
	}

	//fly 인터페이스가 있으면 사용가능한 메서드 추가
	private static void flyAnimal(Fly fly){
		System.out.println("동물 비행 테스트 시작 ");
		fly.fly();
		System.out.println("동물 비행 테스트 종료 ");
	}
}
