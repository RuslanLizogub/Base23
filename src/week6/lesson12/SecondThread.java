package week6.lesson12;

public class SecondThread extends Thread {
	private String name;

	public SecondThread(String n) {
		name = n;
	}

	@Override
	public void run() {
		while (true) {
			if (isInterrupted())
				break;
		}
		System.out.println(name + " is has stopped");

	}
}
