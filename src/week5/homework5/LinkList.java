package week5.homework5;

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
public class LinkList {
	private Node head; // указатель на первый элемент
	private Node tail; // указатель последний элемент
	int count;

	// 6. Поменять местами наибольший и наименьший элементы, в случае если
	// реализован интерфейс Comparable, метод void swapMaxMin()
	void swapMaxMin(){
		
	}
	
	// 5. Перестроить элементы в списке в обратном порядке, метод void revert()
	void revert() {
		Node tempNode;
		Node prevNode = null;
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.getNextNode() == null) {
				head.setNextNode(null);
				head = currentNode;
			}
			tempNode = currentNode.getNextNode();
			currentNode.setNextNode(prevNode);
			prevNode = currentNode;
			currentNode = tempNode;
		}
	}

	int listSize() {
		count = 0;
		Node bufer = head;
		while (bufer != null) {
			count++;
			bufer = bufer.next;
		}
		return count;
	}

	// 4. Поменять местами первый и последний элементы, метод void
	// swapFirstLast()
	void swapFirstLast() {
		if (head == null) // если список пуст -
			return; // ничего не делаем

		if (head == tail) { // если список состоит из одного элемента ничего не
							// делаем
			return; // и выходим
		}

		int bufer = head.element;
		head.setElement(tail.element);
		tail.setElement(bufer);
	}

	// 3. Поиск элемента по значению, метод int indexOf(int element)
	int indexOf(int element) {
		int valueIndex = -1;

		Node t = head;
		while (t != null) {
			if (t.element == element) {
				valueIndex = t.index;
			}
			t = t.next;
		}

		return valueIndex;
	}

	// 2. Удаление элемента по индексу, метод void remove(int index)
	void remove(int index) {
		if (head == null)
			return;

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		if (head.index == index) {
			head = head.next;
			return;
		}

		Node t = head;
		while (t.next != null) {
			if (t.next.index == index) {
				if (tail == t.next) {
					tail = t;
				}
				t.next = t.next.next;
				return;
			}
			t = t.next;
		}
	}

	// 1. Замена значения элемента по индексу, метод void set(int index, int
	// element)
	void set(int index, int element) {
		Node t = head;
		while (t != null) {
			if (t.index == index) {
				t.element = element;
				return;
			}
			t = t.next;
		}
	}

	void addFront(int index, int element) { // добавить спереди
		Node a = new Node(index, element);
		a.index = index;
		a.element = element;
		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.next = head;
			head = a;
		}
	}

	void addBack(int index, int element) { // добавление в конец списка
		Node a = new Node(index, element);
		a.index = index;
		a.element = element;
		if (tail == null) {
			head = a;
			tail = a;
		} else {
			tail.next = a;
			tail = a;
		}
	}

	void printList() // печать списка
	{
		Node t = head;
		while (t != null) {
			System.out.println(t.index + " - " + t.element);
			t = t.next;
		}
	}
}
