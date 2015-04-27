package week1.lesson2;

public class Car {
	String number;
	String color;
	public void printAboutMe(){
		   System.out.println(number + " " + color);
	}
	
	public void start(){
		   System.out.println("Авто с номером " + number + " завелась.");
	}
	
	public void move(){
		   System.out.println("Авто с номером " + number + " начала движение.");
	}
	
	public void stop(){
		   System.out.println("Авто с номером " + number + " остановилась с выключением двигателя.");
	}
}
