package week5.lesson9;
/*
 * Task 4. Добавить к перечислению метод проверки наличия определенного цвета boolean isExist(String s).
 То есть метод принимает строку с цветом. Определить есть ли такой цвет в константах.
 */
public enum MyEnum {
	Red, Black, White;

	public static void myMethod() {
		System.out.println("myMethod");
	}

	public static void main(String[] args) {
		myMethod();
	}
	
	boolean isExist(String s){
		
		return false;
	}
}
