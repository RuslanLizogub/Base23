package week6.lesson12;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

class MyThread1 extends Thread {
	String name;

	public MyThread1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

		// Date date = new Date();
		while (true) {
			System.out
					.println(format1.format(new GregorianCalendar().getTime()));
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				break;
			}
			if (isInterrupted())
				return; // or break;
		}
	}
}
