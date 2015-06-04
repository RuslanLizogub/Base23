package week5.homework5;

/*
 Написать метод, выполняющий двоичный поиск (не рекурсивный) элемента в массиве.

 public class BinarySearcher {
 public int binarySearch(int[] vector, int elements) {
 }
 }
 */
public class BinarySearcher {

	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int elements = 5;
		System.out.println(binarySearch(vector, elements));
	}

	public static int binarySearch(int[] arr, int val) {
		bubbleSort(arr);
		return rank(val, arr, 0, arr.length - 1);
	}

	private static int rank(int val, int[] arr, int lo, int hi) {
		if (lo > hi)
			return -1;

		int mid = lo + (hi - lo) / 2;

		if (val < arr[mid]) {
			return rank(val, arr, lo, mid - 1);
		} else if (val > arr[mid]) {
			return rank(val, arr, mid + 1, hi);
		} else {
			return mid;
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
