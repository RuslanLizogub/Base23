package week2.lesson4;
/*
 1) Создаем класс Car(String number, String color) конструкторы. 
 Методы: 
 1. move - ездить(не должна ехать, пока не заведена!)
 2. start - заводимся(нелья завести, если в движении)
 3. stop -  полная остановка, с выключением двигателя.
 */
public class Car {
	private Track track;
	
	private String number;
	private String color;
	private int status = 0;//0 - стоит заглушена, 1 - стоит заведена, 2 - едет заведена
	
	public void setTrack(Track t){
		track = t;
	}
	public void unSetTrack(){
		track = null;
	}
	public void printAboutMe(){
		
	}
	
	public Car (String number,String color){
		this.number = number;
		this.color = color;
	}
	
	public void start(){
		   if(status == 0){
			   System.out.println("Авто с номером " + number + " завелась.");
			   status = 1;
		   }else if(status == 1){
			   System.out.println("авто " + number + " не могу завестись так как уже заведена");
		   }else{
			   System.out.println("авто " + number + " не могу завестись так как уже заведена и еду.");
		   }
	}
	
	public void move(){
		if(status == 1){
			System.out.println("Авто с номером " + number + " начала движение.");
			status = 2;
		}else if(status == 0){
			System.out.println("Авто с номером " + number + " не может ехать та как еще не заведено.");
		}else{
			System.out.println("Авто с номером " + number + " не может ехать так как уже в пути.");
		}
	}
	
	public void stop(){
		if(status == 2){
			 System.out.println("Авто с номером " + number + " остановилась с выключением двигателя.");
			 status = 0;
		}else if(status == 1){
			 System.out.println("Авто с номером " + number + " не может остановится так как стоит, но двигатель мы выключили.");
		}else{
			 System.out.println("Авто с номером " + number + " не может остановится так как уже стоит, и двигатель выключен.");
		}
	}
}
