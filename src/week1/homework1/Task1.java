package week1.homework1;
/*
 *  Пользователь вводит число. Считать в виде строки. Определить сумму цифр числа.
 Считывание строки выполнить в методе main.
 Написать метод определения суммы и результат вывести на экран.
 public boolean calcDigitsCount(String number)
 Пример:
 calcDigitsCount("131")
 5
 */
public class Task1 {
	public static void main(String[] args){
		String numbers = "123";
		
		calcDigitsCount(numbers);
	}
	
	public static int calcDigitsCount(String numbers){
		int lengthNumbers = numbers.length();
		int result = 0;
		for(int i = 0; i < lengthNumbers; i++){
			char first = numbers.charAt(i);
			int number = Character.getNumericValue(first);
			result = result + number;
		}
		System.out.println(result);
		
		return result;
	}
}
