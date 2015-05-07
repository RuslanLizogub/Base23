package week1.homework1;
/*
 *  Написать метод определения поместится ли коробка полностью на полку?
 Метод принимает 4- аргумента длины и ширины полки и коробки.
 public boolean isContains(int boxWidth, int boxHeight, int shelfWidth, int shelfHeight)
 Пример:
 isContains(3, 4, 5, 3)
 true
 */
public class Task3 {
	public static void main(String[] args){
		int boxWidth = 10; 
		int boxHeight = 5; 
		int shelfWidth = 5; 
		int shelfHeight = 10;
		
		if(isContains(boxWidth,boxHeight,shelfWidth,shelfHeight) == true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	
	public static boolean isContains(int boxWidth, int boxHeight, int shelfWidth, int shelfHeight){
		boolean bufer;
		boolean bufer2;
		boolean result;
		
		if(boxWidth <= shelfWidth || boxWidth <= shelfHeight){
			bufer = true;
		}else{
			bufer = false;
		}
		
		if(boxHeight <= shelfHeight || boxHeight <= shelfWidth){
			bufer2 = true;
		}else{
			bufer2 = false;
		}
		
		
		if(bufer == true && bufer2 == true){
			result = true;
		}else{
			result = false;
		}
		
		return result;
	}
	
}
