public class Graph<E> {
	Set<Node> graph;

	public Graph() {
		graph = new HashSet<>();
	}


	class Node<E> {

		private data;
		private Set<Node> edges;

		public Node(E data) {
			this.data = data;
			edges = new HashSet<>();
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public void addEdge(Node node) {
			edges.add(node);
		}

		public void removeEdge(Node node) {
			edges.remove(node);
		}

		public Set<Node> getEdges() {
			return edges;
		}
	}
}
