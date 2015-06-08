package week6.homework6;

/*
 * Написать класс LinkList, содержащий элементы типа int, реалзизующем связанный список с классом элемента Node.
 Для класса LinkList написать методы:

 1. Замена значения элемента по индексу, метод void set(int index, int element)
 2. Удаление элемента по индексу, метод void remove(int index)
 3. Поиск элемента по значению, метод int indexOf(int element)
 4. Поменять местами первый и последний элементы, метод void swapFirstLast()
 5. Перестроить элементы в списке в обратном порядке, метод void revert()
 6. Поменять местами наибольший и наименьший элементы, в случае если реализован интерфейс Comparable, метод void swapMaxMin()
 7. Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
 8. Сравнение двух списков, метод boolean equals(LinkList list)
 9. Сложение двух списков, метод LinkList concat(LinkList list)
 10*. Отсортировать список, в случае если реализован интерфейс Comparable, метод void sort()
 11*. Удалить повторяющиеся элементы из списка, в случае если реализован интерфейс Comparable, метод void removeDuplicates()
 */
class LinkList {
	private Node fistElement;
	private Node lastElement;
	Node indexSearch;
	Node indexToDelete;
	Node tempElement;
	private int index = 0;

	// добавить элемент в список
	void add(int data) {
		Node addElement = new Node();
		addElement.setData(data);
		if (fistElement == null) {
			fistElement = addElement;
			lastElement = addElement;
			addElement.setIndex(1);
		} else {
			addElement.nextElement = fistElement;
			fistElement = addElement;
			addElement.setIndex(addElement.nextElement.getIndex() + 1);
		}
	}

	// по индексу изменить значение элемента
	public void set(int index, int element) {
		if (indexSearch == null) {
			indexSearch = this.fistElement;
			set(index, element);
		} else {
			if (indexSearch.getIndex() == index) {
				indexSearch.setData(element);
				indexSearch = null;
			} else {
				indexSearch = indexSearch.nextElement;
				set(index, element);
			}
		}
	}

	// удалить по индексу элемент
	public void remove(int index) {
		if (fistElement == null) {
			return;
		}
		if (fistElement.nextElement == null) {
			fistElement = null;
			lastElement = null;
			return;
		}
		if (fistElement.getIndex() == index) {
			fistElement = fistElement.nextElement;
			return;
		}
		if (indexSearch == null) {
			indexSearch = fistElement;
			remove(index);
		} else if (indexSearch.nextElement.getIndex() == index) {
			indexSearch.setIndex(indexSearch.nextElement.getIndex());
			indexSearch.nextElement = indexSearch.nextElement.nextElement;
			indexSearch = null;
		} else {
			indexSearch.setIndex(indexSearch.nextElement.getIndex());
			indexSearch = indexSearch.nextElement;
			remove(index);
		}
	}

	// найти индекс элемента по значению элемента
	public int indexOf(int element) {
		if (fistElement == null) {
			System.out.println("Список пуст");
			;
		}
		if (fistElement.getData() == element) {
			index = fistElement.getIndex();
		}
		if (indexSearch == null) {
			indexSearch = fistElement;
			indexOf(element);
		} else if (indexSearch.getData() == element) {
			index = indexSearch.getIndex();
		} else {
			if (indexSearch.nextElement == null) {
				System.out.println("Нету элементов со значением " + element);
				index = 0;
			} else {
				indexSearch = indexSearch.nextElement;
				indexOf(element);
			}
		}
		indexSearch = null;
		return index;
	}

	// поменять местами первый и последний элемент

	public void swapFirstLast() {
		if (fistElement == lastElement) {
			System.out.println("В списке 1 элемент");
		}
		indexSearch = fistElement.nextElement;
		// index = fistElement.getIndex();
		// indexSearch = indexSearch.nextElement;
		tempElement = indexSearch;
		fistElement.nextElement = null; // вычленяем первый элемент [5-null]
		for (int i = 1; i < index - 2; i++) { // из цепочки [4-1-null] вычленяем
												// последний элемент [1-null],
												// итого имеем [4-2-null]
			tempElement = tempElement.nextElement;
		}
		tempElement.nextElement = fistElement; // в цепочку [4-2-null] на место
												// [null] вставляем ссылку на
												// пятый вычлененный элемент
												// [5-null]
		lastElement.nextElement = indexSearch; // в цепочку [4-2-5-null]
												// вставляем первый элемент
												// [1-null], делая ссылку вместо
												// [null] на [4]
		fistElement = lastElement;
		indexSearch = null;
		tempElement = null;
	}

	// перестройка элементов в списке в обратном порядке
	public void revert() {
		// tempElement = lastElement;
		int stepBack = 2;
		Node revertList = new Node();
		revertList = lastElement;

		index = fistElement.getIndex();
		do {
			tempElement = fistElement;
			one: for (int i = 1; i <= index - stepBack + 1; i++) {
				if (stepBack == index) {
					tempElement.nextElement = null;
				} else {
					tempElement = tempElement.nextElement;
					if (i == index - stepBack) {
						tempElement.nextElement = null;
						break one;
					}
				}
			}
			revertList.nextElement = tempElement;
			revertList = revertList.nextElement;
			stepBack++;
		} while (revertList.getIndex() != index);
		fistElement = lastElement;

	}

	// Поменять местами наибольший и наименьший элементы, в случае если
	// реализован интерфейс Comparable, метод void swapMaxMin()
	public void swapMaxMin() {
		Node maxElement = fistElement;
		Node minElement = fistElement;
		Node currentElement = fistElement;
		int tempValue;
		int indexMax, indexMin;
		while (currentElement != null) {
			if (currentElement.compareTo(maxElement) == 1) {
				maxElement = currentElement;
			}
			if (currentElement.compareTo(minElement) == -1) {
				minElement = currentElement;
			}
			currentElement = currentElement.nextElement;
		}
		tempValue = minElement.getData();
		indexMax = indexOf(maxElement.getData());
		indexMin = indexOf(minElement.getData());
		set(indexMin, maxElement.getData());
		set(indexMax, tempValue);
	}

	// Частично упорядочить элементы списка, в случае если реализован интерфейс
	// Comparable, метод void sortPartial(int index)
	public void sortPartial(int index) {
		indexSearch = fistElement;
		if (index > fistElement.getIndex() || index < 1) {
			System.out.println("В списке максимальный индекс = "
					+ fistElement.getIndex() + " , минимальный = 1");
		}
		while (indexSearch.getIndex() != index) {
			indexSearch = indexSearch.nextElement;
		}
		while (indexSearch != null) {
			indexSearch.compareTo(indexSearch.nextElement);
			indexSearch = indexSearch.nextElement;
		}
	}

	// Сравнение двух списков, метод boolean equals(LinkList list)
	public boolean equals(LinkList list) {
		boolean res = false;
		if (this.index == list.index) {
			while (this.fistElement == list.fistElement) {
				res = this.fistElement == list.fistElement;
				fistElement = fistElement.nextElement;
				this.fistElement = this.fistElement.nextElement;
				if (fistElement == null && this.fistElement == null) {
					res = true;
					break;
				}
			}
			if (this.fistElement != list.fistElement) {
				res = false;
			}
		}
		return res;
	}

	// Сложение двух списков, метод LinkList concat(LinkList list)
	public LinkList concat(LinkList list) {
		Node tempLastElement = this.lastElement;
		tempLastElement.nextElement = list.fistElement;
		return this;
	}

	// печать списка
	void printList() {
		Node node = fistElement; // получаем ссылку на первый элемент
		while (node != null) // пока элемент существуе
		{
			System.out.print("value = " + node.getData() + "; index = "
					+ node.getIndex() + " ");
			node = node.nextElement; // и переключаемся на следующий
		}
	}

}