package week2.lesson3;
/*
Задача Телефон: 
создать класс Phone с полями:
static Phone[] numbers, String myNumber
при создании нового объекта-телефона, он вносится в базу номеров numbers. 
c методами: 
- isNumberExist(String number) - проверяет наличие телефона в базе
- call(String number) - выводит на экран "телефон такой-то звонит такому-то"
- sendSms(String number, String text) - выводит на экран сообщение и кому адрессовано 
Ограничение в 10 телефонов.
*/
public class MainPhone {
	public static void main(String[] args){
		Phone[] phones = new Phone[10];
		for(int i = 0;i < 10; i++){
			int randPhone = (int) ((Math.random()*9999999)) + 1000000;
			String number = "" + randPhone;
			phones[i] = new Phone(number);
		}
	}
}
