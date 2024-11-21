package poly.basic;

public class CastingMain1 {

	public static void main(String[] args) {
		//부모 변수가 자식 인스턴스 참조(다형적참조)

		Parent poly = new Child();
		//단 자식의 기능은 호출 할 수 없다. 컴파일 오류 발생
		// poly.childMethod();

		//다운 캐스팅 ( 부모타임 -> 자식 타입)
		Child child = (Child) poly;
		child.childMethod();

	}
}
