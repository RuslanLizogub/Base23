package week6.lesson12;

public class Main {

	public static void main(String[] args) {
		MyThread obj1 = new MyThread("first");
		MyThread obj2 = new MyThread("two");
		
		obj1.start();
		obj2.start();
	}

}
