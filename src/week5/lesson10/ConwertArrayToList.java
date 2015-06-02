package week5.lesson10;

public class ConwertArrayToList {
	public static void main(String[] args) {
		int[] array = {11, 22, 33, 44, 55};
		
		for (int i = 0; i < array.length; i++) {
			NodeArray.addElementFront(array[i]);
		}
		
		NodeArray.printListNode();
	}
}
