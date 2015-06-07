package week6.lesson12;

public class FirstThread extends Thread {
	private String name;

	public FirstThread(String n) {
		name = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + "_" + i);
		}
	}
}
