package week6.lesson12;
/*
 * Task 2. Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.
 */
public class MainTask2 {

	public static void main(String[] args) {
		Task2 obj1 = new Task2(1,"qqq");
		
		obj1.start();
	}

}
