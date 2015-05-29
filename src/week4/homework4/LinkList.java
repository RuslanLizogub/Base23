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
	int index;
	int element;
	static LinkList head;
	static LinkList tail;
	LinkList next;
	
	public void setElement(int element){
		this.element = element;
	}

	public LinkList(int index, int element) {
		this.index = index;
		this.element = element;
	}

	public LinkList() {

	}
	// / 5. Перестроить элементы в списке в обратном порядке, метод void revert()
	public static void revert(){
		if(head == null)        //если список пуст - 
            return;             //ничего не делаем
 
        if (head == tail) {     //если список состоит из одного элемента ничего не делаем
            return;             //и выходим
        }
        
    	LinkList s = tail;
    	int buferElement;
        for(int i = 0; i < sizeLinkList(); i++){
        	int[] buferArray = new int [sizeLinkList()];
        	buferElement = s.element;
        	set( i, buferElement);
        	s = s.next;
        }
        
	}
	public static int sizeLinkList(){
		int size = 0;
		if(head == null)        //если список пуст - 
            return size;             //ничего не делаем
 
        if (head == tail) {     //если список состоит из одного элемента ничего не делаем
            return size = 1;             //и выходим
        }
        LinkList s = head;
        while(s != null){
        	size = size + 1;
        	s = s.next;
        }
		return size;
	}
	// 4. Поменять местами первый и последний элементы, метод void swapFirstLast()
	public static void swapFirstLast(){
		if(head == null)        //если список пуст - 
            return;             //ничего не делаем
 
        if (head == tail) {     //если список состоит из одного элемента ничего не делаем
            return;             //и выходим
        }
        
        int bufer = head.element;
        head.setElement(tail.element);
        tail.setElement(bufer);
	}
	// 3. Поиск элемента по значению, метод int indexOf(int element)
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
	//  1. Замена значения элемента по индексу, метод void set(int index, int element)
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
}
