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
class Fish extends Product {
	private String storagePeriod;
	public Fish(double price, int bar, String storagePeriod, String fishName) {
		super(price, bar, fishName);
		this.setStoragePeriod(storagePeriod);
	}
	
	public void printPrise(){
		System.out.println(this.getPrice());
	}
	
	public void printStoragePeriod(){
		System.out.println(this.getStoragePeriod());
	}
	
	public void swim(){
		System.out.println("Рыбка поплыла.");
	}
	
	public void cannibalism(Fish fish){
		System.out.println(this.getFishName() + " скушала рыбку " + fish.getFishName());
	}
	
	public void printBarAndPrice(){
		System.out.println("Штрихкод рыбы: " + super.getBar());
		System.out.println("Цена рыбы: " + super.getPrice());
	}

	public String getStoragePeriod() {
		return storagePeriod;
	}

	public void setStoragePeriod(String storagePeriod) {
		this.storagePeriod = storagePeriod;
	}
	
}
