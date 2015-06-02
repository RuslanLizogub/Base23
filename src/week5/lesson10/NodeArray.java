package week5.lesson10;

public class NodeArray {
	int value;
	NodeArray next;
	static NodeArray head;
	static NodeArray tail;

	public NodeArray(int value){
		this.value = value;
	}
	
	public static void addElementFront(int value) { // добавляет елемент спереди
		NodeArray a = new NodeArray(value);

		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.next = head;
			head = a;
		}
	}
	
	static void printListNode() {
		NodeArray t = head;
		while (t != null) {
			System.out.println("Element = " + t.value);
			t = t.next;
		}
	}
}
