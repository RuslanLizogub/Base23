package week2.homework2;

import week2.lesson4.Track;

/*
 * Написать классы Car, Track, AutoSalon.
 class Car{String number; String color; Track track;}
 class Track{String number; Car car;}
 class AutoSalon{ArrayList<Car> cars;ArrayList<Track> tracks; String[] menuList;}
 class MainAutoSalon{ 
 public static void main(String[] args){
 AutoSalon autoSalon = new AutoSalon();
 autoSalon.start();
 }}
 Требованию к закреплению и откреплению:
 1. Если прицеп закреплен за другим авто, то нельзя его закрепить для текущего.
 2. Если прицеп не прикреплен к текущему авто, то нельзя его открепить от этого авто.
 3. Методы закрпеления и открепления должны быть в классе Car
 и другие правила, которые должны быть соблюдены, для того, чтобы была корректность ссылок
 Меню операций:
 1. Добавить новый автомобиль
 2. Добавить новый прицеп
 3. Закрепить к авто прицеп(запрос индексов авто и прицепов)
 4. Открепить от авто прицеп(запрос индекса авто).
 5. Отобразить список авто.
 6. Отобразить список прицепов.
 7. Отобразить закрепления авто за прицепами.
 8*. Вызвать метод start для авто (запрос индекса авто).
 9*. Вызвать метод move для авто (запрос индекса авто).
 10*. Вызвать метод stop для авто (запрос индекса авто).
 11**. Отобразить список всех авто и прицепов с закреплениями и состояниями авто и прицепов.
 12. Выход
 Задания *: связать методы класса Car (start, move, stop) с методами класса Track(roll,stop). 
 При попытке вызвать метод move для авто, вызвается метод roll для прицепа. 
 При попытке вызвать метод stop для авто, вызвается метод stop для прицепа.
 */
public class Car {
	private Track track;
	private String number;
	private String color;
	private int status = 0;// 0 - стоит заглушена, 1 - стоит заведена, 2 - едет
							// заведена

	/*
	 * public void setTrack(Track t){ 
	 * track = t; 
	 * } 
	 * public void unSetTrack(){
	 * track = null; 
	 * }
	 */

	public Car(String number, String color) {
		this.number = number;
		this.color = color;
		this.track = track;
	}

	public void start() {
		if (status == 0) {
			System.out.println("Авто с номером " + number + " завелась.");
			status = 1;
		} else if (status == 1) {
			System.out.println("авто " + number
					+ " не могу завестись так как уже заведена");
		} else {
			System.out.println("авто " + number
					+ " не могу завестись так как уже заведена и еду.");
		}
	}

	public void move() {
		if (status == 1) {
			System.out
					.println("Авто с номером " + number + " начала движение.");
			status = 2;
		} else if (status == 0) {
			System.out.println("Авто с номером " + number
					+ " не может ехать та как еще не заведено.");
		} else {
			System.out.println("Авто с номером " + number
					+ " не может ехать так как уже в пути.");
		}
	}

	public void stop() {
		if (status == 2) {
			System.out.println("Авто с номером " + number
					+ " остановилась с выключением двигателя.");
			status = 0;
		} else if (status == 1) {
			System.out
					.println("Авто с номером "
							+ number
							+ " не может остановится так как стоит, но двигатель мы выключили.");
		} else {
			System.out
					.println("Авто с номером "
							+ number
							+ " не может остановится так как уже стоит, и двигатель выключен.");
		}
	}
}
