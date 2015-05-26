package week4.homework4;

public class SingleLinkedListTest2 {

	public static void main(String[] args) {
		NodeGolovach node0 = new NodeGolovach(0, new NodeGolovach(1, new NodeGolovach(2, new NodeGolovach(3, null))));

		NodeGolovach ref = node0;
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}
	}

}
