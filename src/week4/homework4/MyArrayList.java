package week4.homework4;

/*
 * Написать собственную реализацию динамического массива MyArrayList,
 содержащего целые числа. Реализовать следующие методы
 - void add(int value)
 - int get(int index)
 - boolean set(int index, int value)
 - boolean add(int index, int value)
 - int indexOf(int value)
 - int size()
 - int remove(int index)
 */
public class MyArrayList {
	private int value;
	private int index;
	private MyArrayList head;
	private MyArrayList tail;
	MyArrayList next;

	void add(int value) {
		MyArrayList a = new MyArrayList();
		a.value = value;

		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.next = head;
			head = a;
		}
	}
	
	 void printArray()            
	    {
		 MyArrayList t = head;  
	        while (t != null)  
	        {
	            System.out.print(t.value + " "); 
	            t = t.next;      
	        }
	    }
}
