package week3.lesson5;
/*
 * Task. Написать класс BlockConditioners, Conditioner и MainConditioners.
Класс BlockConditioners-это набор кондишнов.
В блоке управления 10 кондиционеров.
Делегирование.
Класс Conditioner: int temperature, setTemperature(int k), turnOn(),turnOff(), getTemperature(),?? getTurn()
Класс MainConditioner: консольное меню, где вызываются только методы объекта  BlockConditioners.  
Консольное меню:
1. Отобразить состояние всех кондиционеров
2. Включить кондиционер с индексом...
3. Выключить кондиционер с индексом...
4. Установить температуру для кондиционера с индексом...
 */
public class Conditioner {
	private int temperature;
	private boolean state = false;
	public void setTemperature(int k){
		temperature = k;
	}
	public int getTemperature(){
		return temperature;
	}
	
	public void turnOn(){
		if(state == false){
			System.out.println("Кондиционер включен.");
			state = true;
		}else{
			System.out.println("Кондиционер уже включен.");
		}
	}
	
	public void turnOff(){
		if(state == true){
			System.out.println("Кондиционер выключен.");
			state = false;
		}else{
			System.out.println("Кондиционер уже выключен.");
		}
	}
	
	public void gateTurn(){
		if(state == true){
			System.out.println("Кондиционер включен.");
		}else{
			System.out.println("Кондиционер выключен.");
		}
	}
}
