package poly.basic;

// upcasting vs downcasting

public class CastingMain3 {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent1 = (Parent)child; // upcastin은 (Parent) 생략 가능, 생략 권장
		Parent parent2 = child; // upcasting은 생략 가능

		parent1.parentMethod();
		// parent1.childMethod(); // 컴파일 오류

		// 다운캐스팅
		parent2.parentMethod();

	}

}
