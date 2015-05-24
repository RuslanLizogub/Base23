package week4.lesson8;
/*
 * Task2. Написать рекурсивный метод, который принимает в качестве параметров k.
Метод выводит числа от 2 до k.
 */
public class Task2Recursion {
	public static void main(String[] args) {
		recursion(10);
	}

	public static void recursion(int k) {
		if (k > 2) {
			recursion(k - 1);
		}
		System.out.println(k);
	}
}
