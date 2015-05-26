package week4.homework4;

public class SingleLinkedListTest0 {

	public static void main(String[] args) {
		NodeGolovach node0 = new NodeGolovach(0, null);
		NodeGolovach node1 = new NodeGolovach(1, null);
		NodeGolovach node2 = new NodeGolovach(2, null);
		NodeGolovach node3 = new NodeGolovach(3, null);
		
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		NodeGolovach ref = node0;
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}
	}

}
