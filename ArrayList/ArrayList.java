public class ArrayList<E> {

	private E[] array;
	private int lastIndex;
	
	public ArrayList() {
		array = new E[256];
		lastIndex = 0;
	}

	public void add(E item) {
		try {
			array[lastIndex] = item;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			expandArray();
			array[lastIndex] = item;
		}
		lastIndex++;
	}

	public boolean remove(E item) {
		// TODO: Implement
	}

	public boolean empty() {
		// TODO: Implement
	}

	private void expandArray() {
		// TODO: Implement
	}
}
