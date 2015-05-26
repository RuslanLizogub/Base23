package week4.homework4;

public class SingleLinkedListTest10 {

	public static void main(String[] args) {
		NodeGolovach tail = null;
		for (int k = 0; k < 10; k++) {
			tail = new NodeGolovach(k, tail);
		}

		NodeGolovach ref = tail;
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}

	}

}
