package week6.lesson12;

public class MainFirstThread {
	public static void main(String[] args) {
		FirstThread obj1 = new FirstThread("Thr1");
		FirstThread obj2 = new FirstThread("\tThr2");
		FirstThread obj3 = new FirstThread("\t\tThr3");

		obj1.start();
		obj2.start();
		obj3.start();
		System.out.println("end");

	}

}
