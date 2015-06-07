package week6.lesson12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainTask1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 mythr1 = new MyThread1("Object1");
		mythr1.start();
		Scanner scan = new Scanner(System.in);
		System.out.println("Press enter by exit");
		String str = scan.nextLine();
		mythr1.interrupt();

	}
}
