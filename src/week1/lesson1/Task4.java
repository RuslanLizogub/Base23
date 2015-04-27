package week1.lesson1;

import java.util.Scanner;
/*
 * Task4. Написать метод, принимающий в качестве параметра строку. Возвращающий перевернутую строку.
 */
public class Task4 {
	public static void main(String[] args){
		String words = "12345";
		System.out.println(words);
		coupFile(words);
	}
	public static void coupFile(String words){
		int lengthString = words.length();
		String resultVariable = "";
		for (int i = 0; i < lengthString; i++){
			resultVariable = resultVariable + words.charAt((lengthString - 1) - i);
		}
		System.out.println(resultVariable);
	}
}
