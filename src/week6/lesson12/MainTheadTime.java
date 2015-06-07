package week6.lesson12;

import java.util.Scanner;

/*
 Task 1. Создать поток, который будет каждые 10 секунд выводить текущее время на экран. 
 Сделать возможность прерывания потока с помощью команды с консоли.
 */
public class MainTheadTime {
	public static void main(String[] args) {
		System.out.println("Введите \"stop\"");

		ThreadTime thr = new ThreadTime();
		thr.start();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			String s = scanner.nextLine();
			if (s.equals("stop")) {
				thr.interrupt();
				break;
			}
		}
	}
}
