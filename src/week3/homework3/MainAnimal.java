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
public class MainAnimal {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Mur4ik");
		cat1.printName();
		cat1.say();
		cat1.riseHair();
		cat1.eat();
		cat1.yellIfNotGorged();
	}

}
