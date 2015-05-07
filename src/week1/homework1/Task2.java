package week1.homework1;

import java.util.Scanner;

/*
 * Пользователь вводит высоту и ширину двумерного массива (матрицы). Заполнить матрицу случайными числами [0..9] и вывести на экран.
 При вводе неверных размеров массива, выдавать сообщение "Не верный размер массива" и выходить из программы.
 Перед вводом значений НЕ нужно пользователю выдавать сообщений, типа: "Введите ширину".
 Пример:
 3
 4
 1234
 5678
 9123
 */
public class Task2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    int heihgt = scan.nextInt();
		int width = scan.nextInt();
		
		twoDimensionalArray(heihgt,width);
	}
	
	public static void twoDimensionalArray(int heihgt,int width){
		int[][] mayArray;
		
		if(heihgt <= 0 || width <= 0){
			System.out.println("Не верный размер массива");
		}
		
		mayArray = new int[heihgt][width];
		
		//заполняем масив случайными числами
		for(int i = 0;i < heihgt; i++){
			for(int j = 0;j < width; j++){
					mayArray[i][j] =  (int) (Math.random()*9);
			} 
		}
		
		//выводим на екран результат
		for(int i = 0; i < heihgt; i++){
			for(int j = 0; j < width; j++){
				System.out.print(mayArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
