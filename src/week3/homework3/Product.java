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
public class Product {
	private double price;
	private int bar;
	private String fishName;
	
	public Product(double price, int bar, String fishName){
		this.price = price;
		this.bar = bar;
		this.setFishName(fishName);
	}

	public int getBar() {
		return bar;
	}

	public void setBar(int bar) {
		this.bar = bar;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

}
