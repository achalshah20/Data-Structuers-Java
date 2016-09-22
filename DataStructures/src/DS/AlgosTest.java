package DS;

public class AlgosTest {

	public static void main(String args[]) {

		SLinkedList lls = new SLinkedList();

		lls.insertFront(5);
		lls.insertFront(1);
		lls.insertFront(4);
		lls.insertFront(3);

		System.out.println(lls.getSize());
		System.out.println(lls);
		
		lls.insert(4, 50);		
		System.out.println(lls);
		
		lls.delete(2);		
		System.out.println(lls);
		
		lls.delete(0);		
		System.out.println(lls);
		
		
		lls.update(1, 10);		
		System.out.println(lls);
		
		lls.deleteLast();
		System.out.println(lls);
		
		lls.insert(1, 50);
		System.out.println(lls);

		lls.deleteFront();
		System.out.println(lls);

	}

}
