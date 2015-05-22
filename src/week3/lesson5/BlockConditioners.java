package week3.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

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
public class BlockConditioners {
	private ArrayList<Conditioner> condicioners = new ArrayList<>();

	public ArrayList<Conditioner> condicioners() {
		for (int i = 0; i < 10; i++) {
			condicioners.add(new Conditioner());
		}
		return condicioners;
	}

	public ArrayList<Conditioner> getCondicioners() {
		return condicioners;
	}

	public void stateAllConditioners() {
		this.condicioners();
		for (int i = 0; i < condicioners.size(); i++) {
			if (condicioners.get(i).getState() == false) {
				System.out
						.println("Кондиционер с индексом " + i + " выключен.");
			} else {
				System.out.println("Кондиционер с индексом " + i + " включен.");
			}
		}
	}

	private String[] operationNames = {
			"1. Отобразить состояние всех кондиционеров",
			"2. Включить кондиционер с индексом...",
			"3. Выключить кондиционер с индексом...",
			"4. Установить температуру для кондиционера с индексом..." };

	public void printMenu() {
		for (String m : operationNames) {
			System.out.println(m);
		}
	}

	public void consoleMenu() {
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			printMenu();
			System.out.println("Выберите операцию:");
			int k = scan.nextInt();
			switch (k) {
			case 1:
				stateAllConditioners();
				break;
			case 2:
				System.out.println("gggggggg");
				break;
			case 3:
				System.out.println("'''''''");
				break;
			case 4:
				runWhile = false;
			}
		}
	}
}
