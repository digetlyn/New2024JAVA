package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child)parent1;
		child1.childMethod(); // 문제없음.다운캐스팅을 해야 자식 메서드를 호출할 수 있다.

		Parent parent2 = new Parent();
		Child child2 = (Child) parent2; // 컴파일 오류 발생 ClassCastException 오류
		child2.childMethod(); //실행불가

	}
}
