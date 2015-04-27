package week1.lesson2;

public class MainCar {
	public static void main(String[] args){
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		car1.number = "AA 1111";
		car1.color = "black";
		
		car2.number = "AA 2222";
		car2.color = "white";
		
		car3.number = "AA 3333";
		car3.color = "green";
		
		car1.start();
		car2.start();
		car3.start();
		
		car1.move();
		car2.move();
		
		car1.stop();
		car2.stop();
		car3.stop();
    }
}
