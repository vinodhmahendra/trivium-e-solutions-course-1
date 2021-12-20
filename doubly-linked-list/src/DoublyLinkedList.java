
public class DoublyLinkedList {
	
	DoublyNode head;
	DoublyNode tail;
	int size;
	
	
	//delete entire DLL
	public void deleteDLL() {
		DoublyNode tempNode = head;
		for (int i = 0; i < size; i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = null;
		tail = null;
		System.out.println(" The DLL has been deleted! ");
	}
	//search node
	public  boolean searchNode(int nodeValue) {
		if(head != null) {
			DoublyNode tempNode = head;
			for(int i = 0  ; i < size ; i ++) {
				if (tempNode.value == nodeValue) {
					System.out.print("The node id found at location: " +i);
					return true;
				}
				tempNode = tempNode.next;				
			}
		}
		System.out.print("Node not found");
		return  false;
	}
	public void reverseTraverseDLL() {
		 if ( head != null ) {
			 DoublyNode tempNode = tail;
			 for ( int i = 0 ; i < size ; i ++) {
				 System.out.print( tempNode.value);
				 if ( i != size-1) {
					 System.out.print(" -> ");
				 }
				 tempNode = tempNode.prev;
			 }
		 }else {
			 System.out.println("The DLL doest not exist");
		 }
		 System.out.println("\n");
	}
	
	public void insertDLL(int nodeValue,int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		if ( head == null ) {
			createDLL(nodeValue);
			return;
		}else if ( location == 0) {
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
		}else if ( location >= size ) {
			newNode.next = null;
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}else {
			DoublyNode tempNode = head;
			int index = 0;
			while ( index < location -1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.prev = tempNode;
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			newNode.next.prev = newNode;
		}
		size++;
	}
	
	public DoublyNode createDLL(int nodeValue) {
		head = new DoublyNode();
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}
	
	public void traveseDLL() {
		
		if (head != null) {
			DoublyNode tempNode = head;
			for (int i = 0 ; i < size; i++) {
				System.out.print(tempNode.value);
				if ( i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}else  {
			
			System.out.println(" The DLL does not exist");
		}
		System.out.println("\n");
	}

}
