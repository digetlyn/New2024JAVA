package poly.diamond;

public class DiamondMain {

	public static void main(String[] args) {
		InterfaceA child = new Child();
		child.methodA();
		child.methodCommon();

		InterfaceB child2 = new Child();
		child2.methodB();
		child2.methodCommon();

		Child child3 = new Child();
		child3.methodCommon();
	}
}
