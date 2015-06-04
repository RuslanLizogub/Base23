package week5.homework5;

import java.util.Arrays;
/*
 Пользователь вводит количество сортируемых чисел, затем вводит числа.
 Отсортировать введенные числа методом Шелла и вывести на экран пары индексов обмениваемых элементов.
 Метод void sortShell(int[] vector)
 Класс задания: ShellSorter
 Пример:
 sortShell([6, 2, 5, 4, 6, 5])
 3 0
 1 0
 5 4
 4 3
 */
public class ShellSorter {
	public static void main(String[] args) {
		int[] vector = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		sortShell(vector);
		System.out.println(Arrays.toString(vector));
	}

	public static void sortShell(int[] vector) {
		int part = 1;
		while (part < vector.length)
			part = 2 * part + 1;
		while (part > 0) {
			part = part / 2;
			for (int k = 0; k < part; k++) {
				for (int i = part + k; i < vector.length; i += part) {
					int temp = vector[i];
					int j = i - part;
					while (j >= 0 && vector[j] > temp) {
						System.out.println(j + part + " " + j);
						vector[j + part] = vector[j];
						j -= part;
					}
					vector[j + part] = temp;
				}
			}
		}
	}
}
