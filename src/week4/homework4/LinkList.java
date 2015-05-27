package week4.homework4;

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

	public static void main(String[] args) {
		LinkList list = new LinkList();
		for (int i = 0; i < 5; i++) {
			list.addElementFront(i, i + 1);
		}

		set(1, 222);
		printList();
		System.out.println(indexOf(222));
	}
	/////////////
	public static int indexOf(int element){
		LinkList t = head;
		while (t.next != null) {
			if (t.next.element == element) {
				return t.next.index;
			}
			t = t.next;
		}
		return -1;
	}
	
	public static void remove(int index){
		if (head == null) {
			return;
		}

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		if (head.index == index) {
			head = head.next;
			return;
		}

		LinkList t = head;
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
	
	public static void set(int index, int element){
		LinkList t = head;
		while (t.next != null) {
			if (t.next.index == index) {
				t.next.element = element;
				return;
			}
			t = t.next;
		}
	}

	// //////////
	static LinkList head;
	static LinkList tail;

	public void addElementFront(int index, int element) { // добавляет елемент
															// спереди
		LinkList a = new LinkList(index, element);

		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.next = head;
			head = a;
		}
	}

	public void addElementBack(int index, int element) { // добавляет елемент в
															// конец
		LinkList a = new LinkList(index, element);
		if (tail == null) {
			head = a;
			tail = a;
		} else {
			tail.next = a;
			tail = a;
		}
	}

	static void printList() {
		LinkList t = head;
		while (t != null) {
			System.out.println("Element = " + t.element + ", Index = "
					+ t.index + ".");
			t = t.next;
		}
	}

	void delElement(int index) {
		if (head == null) {
			return;
		}

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		if (head.index == index) {
			head = head.next;
			return;
		}

		LinkList t = head;
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

	// //////////
	int index;
	int element;
	LinkList next;

	public LinkList(int index, int element) {
		this.index = index;
		this.element = element;
	}

	public LinkList() {

	}

}
