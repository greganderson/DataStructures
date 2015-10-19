public class LinkedList<E> {
	
	public LinkedList() {
		// TODO: Implement
	}

	public void add(E item) {
		// TODO: Implement
	}

	public void add(E item, int index) {
		// TODO: Implement
	}

	public void remove(E item) {
		// TODO: Implement
	}

	public boolean empty() {
		// TODO: Implement
	}

	class Node<E> {
		private E data;
		private Node nextNode;

		public Node(E data, Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
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
