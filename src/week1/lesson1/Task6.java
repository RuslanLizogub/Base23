package week1.lesson1;

import java.util.Scanner;

/*
 * Task6. Написать программу состоящую из методов:
 - метод, считывает с консоли строку и возвращает ее
 - метод, считывает с консоли символ и возращает его
 - метод, принимает строку и символ, делает поиск символа в строке, возвращает индекс последнего вхождения символа в строке
 - главный метод, только вызовы методов.
 */
public class Task6 {
	public static void main(String[] args){
		scannerLineRead();//считывает с консоли строку и возвращает ее
		scanneSumbolRead();//считывает с консоли символ и возращает его
		scannerLastSumbol();//принимает строку и символ, делает поиск символа в строке, возвращает индекс последнего вхождения символа в строке
	}
	
	public static void scannerLastSumbol(){
		
	}
	
	public static void scannerLineRead(){
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		System.out.println(string);
	}
	
	public static void scanneSumbolRead(){
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		System.out.println(string);
	}
}
