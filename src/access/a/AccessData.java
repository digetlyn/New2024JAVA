package access.a;  //패키지 위치는 package  access.a 이다, 패키지 위치를 꼭 맞춰라

public class AccessData {

	public int publicField;
	int defaultField;
	private int privateField;

	public void publicMethod() {
		System.out.println("publicMethod 호출" + publicField);
	}

	void defaultMethod() {
		System.out.println("defaultMethod 호출" + defaultField);
	}

	private void privateMethod() {
		System.out.println("privateMethod 호출 " + privateField);
	}

	public void innerAccess() {   //이 메서드는 내부 호출을 보여준다. 내부 호출은 자기 자신에게 접근하는것이다.
		// private 을 포함한 모든 곳에 접근 가능
		System.out.println("내부 호출");
		publicField = 100;
		defaultField = 200;
		privateField = 300;
		publicMethod();
		defaultMethod();
		privateMethod();
	}
}
