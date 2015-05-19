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
class Cat extends Animal {
	Cat(String name) {
		super(name);
	}

	public void printName() {
		System.out.println(super.getName());
	}

	public void say() {
		System.out.println(super.getName() + " " + "говорит мяу, мяу!");
	}
	
	public void riseHair(){
		System.out.println(super.getName() + " " + "поднял шерсть дыбом!");
	}
	
	public void eat(){
		System.out.println(super.getName() + " " + "кушает!");
	}
	
	public void yellIfNotGorged(){
		System.out.println(super.getName() + " " + "орет так как не наелась!");
	}
}
