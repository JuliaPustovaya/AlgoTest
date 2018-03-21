public class main {
	public static void main(String args[]) {
		NodeList nodeList = new NodeList();
		nodeList.addElementFront(5);
		nodeList.addElementBack(6);
		nodeList.addElementBack(7);
		nodeList.addElementBack(8);
		nodeList.addElementBack(9);
		nodeList.addElementBack(10);
		System.out.println(nodeList.toString());
		System.out.println("After removal 5");
		nodeList.remove(5);
		System.out.println(nodeList.toString());
		nodeList.remove(8);
		System.out.println(nodeList.toString());
		nodeList.remove(10);
		System.out.println(nodeList.toString());
		System.out.println("Size  " + nodeList.getSize());
	}
}
