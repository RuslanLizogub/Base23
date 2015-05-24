package week4.lesson8;

public class MainNestedInner {
	public static void main(String[] args) {
		MyClass.NestedExmple obj1 = new MyClass.NestedExmple();

		MyClass.InnerExmple obj2 = new MyClass().new InnerExmple();
		obj1.f1();
		obj2.f2();
	}
}
