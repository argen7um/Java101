package wednesday.onofcollection;

import java.util.ArrayList;
import java.util.List;

public class OnOfCollection<T> {

	private List<T> collection;

	public OnOfCollection() {
		collection = new ArrayList<T>();
	}

	public void add(T element) {
		boolean flag = false;
		if (collection.contains(element)) {
			collection.remove(element);
			flag = true;
		}
		if (!flag && element != null) {
			collection.add(element);
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (T t : collection) {
			str += t + " ";
		}
		return str;
	}
}
