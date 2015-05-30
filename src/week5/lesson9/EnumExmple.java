package week5.lesson9;
/*
 * Task 4. Добавить к перечислению метод проверки наличия определенного цвета boolean isExist(String s).
 То есть метод принимает строку с цветом. Определить есть ли такой цвет в константах.
 */
public class EnumExmple {
	public static void main(String[] args) {
		MyEnum obj = MyEnum.Red;
		String s = obj.toString();
		MyEnum obj1 = MyEnum.valueOf(s);
		MyEnum[] vector = MyEnum.values();
		MyEnum.myMethod();
	}
}
