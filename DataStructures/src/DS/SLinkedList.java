package DS;

//Single sided linkedList
public class SLinkedList {

	private LNode head;
	private int size = 0;

	private class LNode {

		private Object item;
		private LNode next;

		public LNode(Object item) {
			this.item = item;
		}
	}

	public void insertFront(Object item) {

		LNode node = new LNode(item);
		node.next = this.head;
		this.head = node;
		this.size++;
	}

	public void deleteFront(){
		delete(0);
	}
	
	public int getSize() {
		return size;
	}

	public String toString() {

		String str = "";
		LNode itr = head;
		while (itr != null) {
			str += itr.item + " ";
			itr = itr.next;
		}

		return str;
	}

	public void insert(int position, int value) {

		LNode current = head;
		LNode prev = null;
		
		// Set prev to the element which is at position - 1
		for (int i = 0; i < position-1; i++) {
			prev = current.next;
			current = prev;
		}

		//System.out.println();

		LNode node = new LNode(value);

		//Set the element at current position to the next to the inserted element
		node.next = current.next;
		
		//Insert element at request position and linked with previous value
		current.next = node;
		
		//Increment linklist size
		this.size++;
	}

	public void delete(int position){
		
		if(size == 1){
			head.item = null;
			head.next =  null;
			this.size--;
			return;
		}else if(size < 1){
			System.out.println("List is empty");
			return;
		}
		
		LNode current = head;
		LNode prev = null;
		
		if(position == 0){
			head = head.next;
			this.size--;
			return;
		}
		
		for(int i = 0; i< position-1;i++){
			prev = current.next;
			current = prev;
		}
		
		current.next = current.next.next;
		
		//Decrement linklist size
		this.size--;
		
		
	}
	
	public void update(int position,int value){
		
		LNode current = head;
		LNode prev = null;
		if(position == 0){
			head.item = value;
		}
		
		for(int i = 0; i < position; i++){
			prev = current.next;
			current = prev;
		}
		
		current.item = value;
	}

	public void deleteLast(){
		//System.out.println("size: " + size);
		delete(size-1);
	}

	public void insertLast(int value){
		//System.out.println("size: " + size);
		insert(size-1, value);
	}
}
