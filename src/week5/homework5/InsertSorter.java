package week5.homework5;

import java.util.Arrays;

/*
 Написать метод, сортирующий массив сортировкой вставками.
 Вывести на экран пары индексов обмениваемых элементов
 public void sortInsertion(int[] vector)
 Пример:
 sortInsertion([3,1,2,3])
 0 1
 1 2
 */
public class InsertSorter {

	public static void main(String[] args) {
		int[] vector = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		sortInsertion(vector);
		System.out.println(Arrays.toString(vector));
	}

	public static void sortInsertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int currElem = arr[i];
			int prevKey = i - 1;
			while (prevKey >= 0 && arr[prevKey] > currElem) {
				System.out.println(prevKey + " " + i);
				arr[prevKey + 1] = arr[prevKey];
				arr[prevKey] = currElem;
				prevKey--;
			}
		}
	}
}
