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
public class Phone {
	static Phone[] numbers;
	static String myNumber;
	
	public Phone(String number){
		myNumber = number;
		for(int i = 0; i < 10; i++){
			if(numbers[i] == null){
				numbers[i] = this;
				break;
			}
		}
	}
}
