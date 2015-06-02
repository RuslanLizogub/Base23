package week5.lesson10;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/* Task1. Написать класс Product у которого есть поля:
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
public class Product {
	private double price;
	private String name;
	private String date;

	// SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
	// date = format1.format(date.getTime());

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}