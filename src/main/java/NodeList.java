public class NodeList {
	private NodeList head;
	private NodeList tail;
	private NodeList next;
	private int value;

	public void addElementFront(int someValue) {
		NodeList list = new NodeList();
		list.value = someValue;
		if (head == null) {
			head = list;
			tail = list;

		} else {

			list.next = head;
			head = list;

		}

	}

	public void addElementBack(int someValue) {
		NodeList list = new NodeList();
		list.value = someValue;
		if (head == null) {
			head = list;
			tail = list;

		} else {
			tail.next = list;

			tail = list;

		}

	}

	public NodeList getTail() {
		return tail;
	}

	public NodeList getNext() {
		return next;
	}

	public NodeList getHead() {

		return head;
	}

	public void printElements() {
		NodeList node;
		node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}

	}

	public boolean isContainedValue(int value) {
		boolean isContainedValue = false;
		NodeList node;
		node = head;
		while (node != null) {
			if (node.value == value) {
				isContainedValue = true;
			}
			node = node.next;
		}
		return isContainedValue;
	}

	public boolean isElementRemoved(int value) {
		if (head != null) {

			NodeList node, nodeNext;
			node = head;

			if (head.value == value) {
				head = node.next;
			}

			while (node.next != null) {

				if (node.next.value == value) {
					nodeNext = node.next.next;
					node.next = nodeNext;

				}

				node = node.next;
				if (node == null && tail.value == value) {
					node = tail;

				}
			}
			return true;
		} else {
			return false;
		}

	}

}
