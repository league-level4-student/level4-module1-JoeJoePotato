package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] items = (T[]) new Object[0];

	public ArrayList() {

	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return items[loc];
	}

	public void add(T val) {
		T[] update = (T[]) new Object[items.length + 1];
		for (int i = 0; i < items.length; i++) {
			update[i] = items[i];
		}
		update[items.length] = val;
		items = update;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] update = (T[]) new Object[items.length + 1];
				for (int i = 0; i < update.length; i++) {
			if (i < loc) {
				update[i] = items[i];
			} else if (i > loc) {
				
				update[i] = items[i - 1];
			}else {
				update[i]=val;
			}
		}
		items = update;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		items[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] update = (T[]) new Object[items.length - 1];
		for (int i = 0; i < update.length; i++) {
			if (i >= loc) {
				update[i] = items[i + 1];
			}
			if (i < loc) {
				update[i] = items[i];
			}
		}
		items = update;
	
	}

	public boolean contains(T val) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return items.length;
	}
}