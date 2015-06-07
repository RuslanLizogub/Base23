package week6.lesson12;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 Task 1. Создать поток, который будет каждые 10 секунд выводить текущее время на экран. 
 Сделать возможность прерывания потока с помощью команды с консоли.
 */
public class ThreadTime extends Thread {
	@Override
	public void run() {

		while (!isInterrupted()) {
			Date curTime = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

			try {
				System.out.println(sdf.format(curTime.getTime()));
				Thread.sleep(10000);
			} catch (Exception e) {
				return;
			}
		}
	}

}
