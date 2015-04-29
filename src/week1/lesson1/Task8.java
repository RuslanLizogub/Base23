package week1.lesson1;
/*
 * Task8. Написать метод int MyIndexOf, который принимает две строки.(не используя indexOf)
 */
public class Task8 {
	public static void main(String[] args){
		String value1 = "abchefgdefhtyf";
		String value2 = "def";
		
		MyIndexOf(value1,value2);
	}
	
	public static int MyIndexOf(String value1,String value2){
		int lengthValue1 = value1.length();
		int lengthValue2 = value2.length();
		int result = -1;
		
		//сначала проверяем не меньше ли искомая строка от базовой строки
		if(lengthValue1 < lengthValue2){
			result = -1;
			//System.out.println("Подстрока не найдена");
		}else{
			//ищем совпадение первого символа в строке
			for(int i = 0; i < lengthValue1; i++){
				char firstValue = value1.charAt(i);
				char secondValue = value2.charAt(0);
				
				//когда совпадение найдено проверяем символы дальше опираясь на длину value2
				if(firstValue == secondValue){
					for(int j = 1; j < lengthValue2; j++){
						if(value1.charAt(i + j)  == value2.charAt(0 + j)){
							result = i + j - (lengthValue2 - 1);
						}else{
							result = -1;
							//System.out.println("Подстрока не найдена s1=" + value1.charAt(i + j) + ", s2=" + value2.charAt(0 + j));
						}
					}
					if (result >= 0){
						break;
					}
				
				}else{
					result = -1;
					//System.out.println("Подстрока не найденаppp " + firstValue + " - " + secondValue);
				}
			}
		}
		System.out.println(result);
		return result;
	}
}
