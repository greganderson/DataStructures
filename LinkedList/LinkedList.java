public class LinkedList<E> {

	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}

	public void add(E item) {
		if (head == null) {
			head = new Node(item);
			size++;
			return;
		}

		Node tempNode = head;

		while (tempNode.getNextNode() != null)
			tempNode = tempNode.getNextNode();

		tempNode.setNextNode(new Node(item));
		size++;
	}

	public void add(E item, int index) {
		if (index >= size)
			throw new ArrayIndexOutOfBoundsException();

		if (head == null) {
			head = new Node(item);
			size++;
			return;
		}

		Node tempNode = head;
		for (int i = 0; i <= index; i++) {
			tempNode = tempNode.getNextNode();
		}

		Node newNode = new Node(item);
		newNode.setNextNode(tempNode.getNextNode());
		tempNode.setNextNode(newNode);
		size++;
	}

	public void remove(E item) {
		// TODO: Implement
	}

	public E get(int index) {
		if (index >= size)
			throw new ArrayIndexOutOfBoundsException();

		Node tempNode = head;
		for (int i = 0; i <= index; i++) {
			tempNode = tempNode.getNextNode();
		}

		return tempNode.getData();
	}

	public boolean empty() {
		// TODO: Implement
	}

	public int size() {
		return size;
	}

	class Node<E> {
		private E data;
		private Node nextNode;

		public Node(E data) {
			this.data = data;
			this.nextNode = null;
		}

		public E getData() {
			return data;
		}

		public void setData(E newData) {
			data = newData;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node newNode) {
			nextNode = newNode;
		}
	}
}
