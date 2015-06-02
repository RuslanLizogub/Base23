package week5.lesson10;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

/*Task1. Написать класс Product у которого есть поля:
 name,price, дата покупки.
 с изначальной сортировкой по наименованию.
 Пусть продукт выводится на экран: Морковка цена дата
 Реализовать возможность отсортировать список:
 - по цене 
 - по дате закупки
 Сделать равными продукты, у которых имя и цена одинаковые.
 В mainProduct:
 создать 10 продуктов.
 с разной датой закупки и разной ценой.
 Вывести список без сортировки
 Отсортировать список и вывести на экран
 Отсортировать список по цене и вывести на экран
 Отсортировать список по дате закупки и вывести на экран
 */
public class MainProduct {
	public static void main(String[] args) {
		Product[] p = new Product[10];
		// заполним объект Product содержимым
		p[0] = new Product();
		p[0].setName("Молоко");
		p[0].setPrice(12.05);

		p[1] = new Product();
		p[1].setName("Кофе");
		p[1].setPrice(100.00);

		p[2] = new Product();
		p[2].setName("Чай");
		p[2].setPrice(42.50);

		p[3] = new Product();
		p[3].setName("Вискас");
		p[3].setPrice(22.40);

		p[4] = new Product();
		p[4].setName("Морковка");
		p[4].setPrice(15.30);

		p[5] = new Product();
		p[5].setName("Капуста");
		p[5].setPrice(36.10);

		p[6] = new Product();
		p[6].setName("Макароны");
		p[6].setPrice(42.00);

		p[7] = new Product();
		p[7].setName("Несквик");
		p[7].setPrice(65.00);

		p[8] = new Product();
		p[8].setName("Яблоки");
		p[8].setPrice(34.50);

		p[9] = new Product();
		p[9].setName("Грибы");
		p[9].setPrice(33.50);

		class SortedByName implements Comparator<Product> {

			public int compare(Product obj1, Product obj2) {

				String str1 = obj1.getName();
				String str2 = obj2.getName();

				return str1.compareTo(str2);
			}
		}
		class SortedByPrice implements Comparator<Product> {

			public int compare(Product obj1, Product obj2) {

				double price1 = obj1.getPrice();
				double price2 = obj2.getPrice();

				if (price1 > price2) {
					return 1;
				} else if (price1 < price2) {
					return -1;
				} else {
					return 0;
				}
			}
		}

		// выведем данные без сортировки
		System.out.println("============ no sorted ==============");
		for (Product i : p) {
			System.out.println("Name: " + i.getName() + " price: "
					+ i.getPrice());
		}
		// отсортируем и выведем данные по цене
		System.out.println("========== sorted by price===========");
		Arrays.sort(p, new SortedByPrice());
		for (Product i : p) {
			System.out.println("Name: " + i.getName() + " price: "
					+ i.getPrice());
		}

		// отсортируем и выведем данные по названию
		System.out.println("========== sorted by name ===========");
		Arrays.sort(p, new SortedByName());
		for (Product i : p) {
			System.out.println("Name: " + i.getName() + " price: "
					+ i.getPrice());
		}
	}

}