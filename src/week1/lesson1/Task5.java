package week1.lesson1;

import java.util.Scanner;
/*
 * Task5. Написать метод, принимающий в качестве параметра строку. 
 * Возвращающий перевернутую строку, не использующий дополнительной строки.
 */
public class Task5 {
	public static void main(String[] args){
		String words = "12345";
		System.out.println(words);
		coupFile(words);
	}
	public static void coupFile(String words){
		int lengthString = words.length();
		for (int i = 0; i < lengthString; i++){
			words = words + words.charAt((lengthString - 1) - i);
		}
		words = words.substring(lengthString,(lengthString + lengthString));
		System.out.println(words);
	}
}
