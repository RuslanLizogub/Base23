package week1.lesson2;
/*
 *  Task 6. Дополнить классы Car и MainCar. 
	Методы: start,move() stop(). Эти объекты выводят на экран сообщение:
	авто с номером таким-то завелась/начала движение/остановилась(с выключением двигателя).
	Для автомобиля эти методы должны менять состояние авто(заводим соответсвующе поле/поля)
	Если авто уже завелась, то выводит сообщение: 
	  - авто такое-то не могу завестись так как уже заведена или 
	  - авто такое-то не могу ехать так как уже еду
	  и т.д.
	Автомобиль не может ехать если не заведен двигатель, не может остановиться если не едет и так далее.
	Продумать все ограничения и реализовать эти 3 метода с учетом состояния авто.
	
	В MainCar: 
	  - создать 3 авто
	  - все 3 авто завести
	  - 2 авто поехали
	  - все 3 авто остановить
 */
public class Car {
	String number;
	String color;
	int status = 0;//0 - стоит заглушена, 1 - стоит заведена, 2 - едет заведена
	
	public void printAboutMe(){
		   System.out.println(number + " " + color);
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
