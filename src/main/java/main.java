public class main {
	public static void main(String args[]){
		NodeList l= new NodeList();
		l.addElementFront(5);
		l.addElementBack(6);
		l.addElementBack(7);
		l.addElementBack(8);
		l.addElementBack(9);
		l.addElementBack(10);
		l.printElements();
		System.out.println("After removal 5");
		l.isElementRemoved(5);
		l.printElements();
		System.out.println("After removal 9");
		l.isElementRemoved(9);
		l.printElements();
		System.out.println("After removal 10");
		l.isElementRemoved(10);
		l.printElements();
		System.out.println("Does it contain the value "+ l.isContainedValue(111));
		
		
	}
}
