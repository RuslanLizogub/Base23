package week6.homework6;

import java.util.Arrays;

/*Написать собственную реализацию динамического массива MyArrayList.
 Сделать параметризированную релизацию списка, параметр E.
 Реализовать следующие методы
 - void add(E value)
 - int get(int index)
 - boolean set(int index, E value)
 - boolean add(int index, E value)
 - int indexOf(E value)
 - int size()
 - E remove(int index)
 */
public class MyArrayList<E> {
	Object[] arr;
	int size;

	public MyArrayList(int size) {
		if (size >= 10) {
			this.arr = new Object[size];
		} else {
			this.arr = new Object[10];
		}
	}

	public MyArrayList() {
		this(10);
	}

	public void add(E value) {
		if (size == arr.length) {
			arr = Arrays.copyOf(arr, (int) (size * 1.5));
		}
		arr[size] = value;
		size++;
	}

	public Object get(int index) {
		return arr[index];
	}

	public Object remove(int index) {
		Object result = arr[index];
		for (int k = index; k < size - 1; k++) {
			arr[k] = arr[k + 1];
		}
		arr[size - 1] = 0;
		size--;
		return result;
	}

	public int size() {
		return size;
	}

	public boolean set(int index, E value) {
		if (index < 0 || index > size) {
			return false;
		}
		arr[index] = value;
		return true;
	}

	public int indexOf(E value) {
		for (int k = 0; k < size; k++) {
			if (value.equals(arr[k])) {
				return k;
			}
		}
		return -1;
	}

	public boolean add(int index, E value) {
		if (index > size || index < 0) {
			return false;
		} else if (size == arr.length) {
			arr = Arrays.copyOf(arr, (int) (size * 1.5));
		}
		System.arraycopy(arr, index, arr, index + 1, size - index);
		arr[index] = value;
		size++;
		return true;
	}
}
