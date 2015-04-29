package week1.lesson2;
/*
 * Task2. Написать метод1 принимающий две строки и возвращающий количество вхождений второй строки в первой.
 */
public class Task2 {
	public static void main(String[] args){
		String string1 = "fffffffffffffabababab";
		String string2 = "fab";
		
		countRepeat(string1,string2);
	}
	public static void countRepeat(String string1,String string2){
		int lengthString1 = string1.length();
		int lengthString2 = string2.length();

		int count = 0;
		for(int i = 0; i < lengthString1; i++){
			if(string1.indexOf(string2,i) == i){
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}
