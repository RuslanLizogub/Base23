package week1.lesson1;
/*
 * Task7. Написать метод boolean myEquals, который принимает две строки.(не используя equals)
 */
public class Task7 {
	public static void main(String[] args){
		String value1 = "111";
		String value2 = "1171";
		
		myEquals(value1,value2);
	}
	
	public static boolean myEquals(String value1,String value2){
		int lengthValue1 = value1.length();
		int lengthValue2 = value2.length();
		
		boolean a = true;
		
		if(lengthValue1 == lengthValue2){
			for(int i = 0; i < lengthValue1; i++){
				char firstValue = value1.charAt(i);
				char secondValue = value2.charAt(i);
				if(firstValue == secondValue){
					a = true;
				}else{
					a = false;
					System.out.println("Строки разные.");
					break;
				}
			}
			System.out.println("Строки одинаковые.");
		}else{
			a = false;
			System.out.println("Строки разные.");
		}
		return a;
	}
}
