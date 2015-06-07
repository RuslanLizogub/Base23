package week6.lesson12;
/*
 * Task 2. Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.
 */
public class Task2 extends Thread{
	int numberThread;
	String nameThread;
	
	public Task2(int numberThread, String nameThread){
		this.numberThread = numberThread;
		this.nameThread = nameThread;
	}
	
	@Override
	public void run(){
		System.out.println(this.numberThread);
		while (true) {
			if(isInterrupted()) break;
		}
		System.out.println("Potok " + nameThread + " stop");
	}
}
