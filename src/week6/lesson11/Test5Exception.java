package week6.lesson11;

public class Test5Exception {
	public static void main(String[] args) {
		int k = (int) (2 * Math.random());
		try {
			int[] a = new int[2];
			a[0] = 22 / 2;
			a[1] = 33 / 3;
			a[2] = 33 / k;
		} catch (ArithmeticException ex) {
			System.out.println("Деление на 0!");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Выход за пределы массива!");
		} catch (Exception ex) {
			System.out.println("Общая ошибка!");
		}
	}
}
