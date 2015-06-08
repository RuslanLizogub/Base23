package week6.homework6;
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
public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		
		list.add(6);
		list.add(6);
		System.out.println(list.size);
		list.set(0, 3);
		System.out.println(list.indexOf(6));
	}

}
