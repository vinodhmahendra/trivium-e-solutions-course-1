
public class Driver {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.createDLL(1);
		dll.insertDLL(2, 0);
		dll.insertDLL(3, 1);
		dll.insertDLL(4, 7);
		
		dll.traveseDLL();
		dll.deleteDLL();
		
		dll.reverseTraverseDLL();
		
//		dll.searchNode(30);
		dll.searchNode(3);
	}

}
