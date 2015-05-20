package week3.homework3;
/*
 * Создать класс Рыба на основе класса "Продукт в супермаркете".
Классы Fish и Product.
Рыба должна уметь:
- Вывести свою цену, метод void printPrice()
- Вывести срок хранения, метод void printStoragePeriod()
- Проплыть, метод void swim()
- Проглотить другую рыбу, метод void cannibalism(Fish fish)
- Вывести свой штрихкод и цену, метод void printBarAndPrice()
 */
public class MainProduct {

	public static void main(String[] args) {
		Fish fish1 = new Fish(112.11, 111111111, "до 12.01.2016", "Петька");
		Fish fish2 = new Fish(12.33, 22222222, "до 12.01.2017", "Vasia");
		fish1.printPrise();
		fish1.printStoragePeriod();
		fish1.swim();
		fish1.cannibalism(fish2);
		fish1.printBarAndPrice();
	}

}
