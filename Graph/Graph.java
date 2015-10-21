public class Graph<E> {

	private Map<E, Set<E>> graph;	// Map<Vertex, Edges>, symbol table
	private int numEdges;

	public Graph() {
		graph = new HashMap<>();
		numEdges = 0;
	}

	/**
	 * Add edge v-w
	 */
	public void addEdge(E v, E w) {
		if (!hasVertex(v))
			graph.put(v, new HashSet<>());
		if (!hasEdge(v, w))
			numEdges++;
		graph.get(v).add(w);
	}

	/**
	 * Number of vertices
	 */
	public int V() {
		return graph.size();
	}

	/**
	 * Number of edges
	 */
	public int E() {
		return numEdges;
	}

	/**
	 * Vertices in the graph
	 */
	public Iterable<E> vertices() {
		return graph.keySet();
	}

	/**
	 * Neighbors of v
	 */
	public Iterable<E> adjacentTo(E v) {
		if (!hasVertex(v))
			return new HashSet<>();
		return graph.get(v);
	}

	/**
	 * Number of neighbors of v
	 */
	public int degree(E v) {
		if (!hasVertex(v))
			return 0;
		return graph.get(v).size();
	}

	/**
	 * Is v a vertex in the graph?
	 */
	public boolean hasVertex(E v) {
		return graph.containsKey(v);
	}

	/**
	 * is v-w an edge in the graph?
	 */
	public boolean hasEdge(E v, E w) {
		if (!hasVertex(v))
			return false;
		return graph.get(v).contains(w);
	}
}
