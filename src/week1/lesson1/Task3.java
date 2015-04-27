package week1.lesson1;

import java.util.Scanner;
/*
 * Ввести с консоли строку с символами и пробелами. Посчитать количество слов в предлождении.
 */
public class Task3 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String words = scan.nextLine();
		String[] wordsArray = words.split(" ");
		int lengthWordsArray = wordsArray.length;
		System.out.println(lengthWordsArray);
	}
}
