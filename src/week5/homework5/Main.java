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
public class Main {

	public static void main(String[] args) {
		LinkList ml = new LinkList();
		ml.addBack(1, 22222);
		ml.addBack(2, 33);
		ml.addBack(3, 333);
		ml.addBack(4, 44444);

		ml.printList();
		
		System.out.println();
		ml.revert();
		ml.printList();
	}

}
