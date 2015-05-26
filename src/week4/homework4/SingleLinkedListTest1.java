package week4.homework4;

public class SingleLinkedListTest1 {

	public static void main(String[] args) {
		NodeGolovach node4 = new NodeGolovach(3, null);
		NodeGolovach node2 = new NodeGolovach(2, node4);
		NodeGolovach node1 = new NodeGolovach(1, node2);
		NodeGolovach node0 = new NodeGolovach(0, node1);
		
		NodeGolovach ref = node0;
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}

	}

}
