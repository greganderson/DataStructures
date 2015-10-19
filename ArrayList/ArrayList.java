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

	public void add(E item, int index) {
		// TODO: Implement
	}

	public void remove(E item) {
		int i = 0;
		for (; i < array.length; i++) {
			if (array[i] == item)
				break;
		}
		for (; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		lastIndex--;
	}

	public E get(int index) {
		if (index >= array.length)
			throw new ArrayIndexOutOfBoundsException();
		return array[index];
	}

	public boolean empty() {
		return lastIndex == 0;
	}

	private void expandArray() {
		E[] tempArray = new E[array.length];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}

		array = new E[array.length * 2];
		for (int i = 0; i < tempArray.length; i++) {
			array[i] = tempArray[i];
		}
	}
}
