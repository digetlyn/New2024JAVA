package extends1.super1;

public class Child extends Parent{

	public String value = "child";

	@Override
	public void hello(){
		System.out.println("Child.hello");

	}

	public void call(){
		System.out.println("this value = " + this.value);  //this 생략가능 this는 자기 자신
		System.out.println("super value = " + super.value); //super는 나의 부모타입에서 찾는것

		this.hello();
		super.hello();
	}
}
