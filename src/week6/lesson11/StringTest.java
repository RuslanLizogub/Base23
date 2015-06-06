package week6.lesson11;

/*
 Task 5. Написать метод, проверяющий, является ли строка числом. 
 Воспользоваться Integer. valueOf( str ). Если строка не число, то метод должен кидать исключение NullPointerException.
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "11";
		isStrInt(str);
	}

	public static void isStrInt(String str) {
		try {
			Integer x = Integer.valueOf(str);
			System.out.println(x);
		} catch (NullPointerException ex) {
			System.out.println("Общая ошибка");
		}
	}

}
