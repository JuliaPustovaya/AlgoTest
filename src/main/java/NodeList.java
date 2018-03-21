public class NodeList<T> {
	private NodeList head;
	private NodeList tail;
	private NodeList next;
	private T value;

	public void addElementFront(T someValue) {
		NodeList list = new NodeList();
		list.value = someValue;
		if (head == null) {
			tail = list;
		} else {
			list.next = head;
		}
		head = list;
	}

	public void addElementBack(T someValue) {
		NodeList list = new NodeList();
		list.value = someValue;
		if (head == null) {
			head = list;
		} else {
			tail.next = list;
		}
		tail = list;
	}

	public NodeList getNext() {
		return next;
	}

	public NodeList getHead() {
		return head;
	}

	@Override
	public String toString() {
		NodeList node;
		node = head;
		String result = "[ ";
		while (node != null) {
			result = result + node.value + ", ";
			node = node.next;
		}
		result = result.substring(0, result.length() - 2);
		return result + " ]";
	}

	public boolean contains(T value) {
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

	public boolean remove(T value) {
		if (!isEmpty()) {
			if (head.value == value) {
				head = head.next;
				return true;
			}
			NodeList node = head;
			while (node.next != null) {
				if (node.next.value == value) {
					if (tail == node.next) {
						tail = node;
					}
					node.next = node.next.next;
					return true;
				}
				node = node.next;
			}
		}
		return true;
	}

	public int getSize() {
		int size = 0;
		NodeList tempNodeList = head;
		while (tempNodeList != null) {
			size++;
			tempNodeList = tempNodeList.getNext();
		}
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}
}
