package week3.homework3;
/*
 * Создать класс Кошка на основе класса Животное.
Классы Cat и Animal.
Кошка должна уметь:
- Вывести на экран имя, метод void printName()
- Подать голос, метод void say()
- Поднимать шерсть дыбом, метод void riseHair()
- Питаться, метод void eat()
- Орать если ненаелась, метод void yellIfNotGorged()
 */
public class Animal {
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	Animal(String name){
		this.name = name;
	}
}
