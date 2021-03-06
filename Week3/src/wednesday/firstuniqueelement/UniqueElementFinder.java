package wednesday.firstuniqueelement;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueElementFinder {

	public static <T> T findeUnique(Collection<T> collection) {
		Map<T, Integer> unique = new HashMap<>();
		for (T t : collection) {
			if (!unique.containsKey(t)) {
				unique.put(t, 1);
			} else {
				unique.put(t, unique.get(t) + 1);
			}
		}

		for (Entry<T, Integer> t : unique.entrySet()) {
			if (t.getValue() == 1) {
				return t.getKey();
			}
		}
		return null;
	}

	public static <T> void main(String[] args) {
		@SuppressWarnings("unchecked")
		Collection<T> ints = (Collection<T>) Arrays.asList(1, 2, 2, 7, 3, 4, 5,
				5, 4, 3, 1);
		System.out.println(findeUnique(ints));
		@SuppressWarnings("unchecked")
		Collection<T> strings = (Collection<T>) Arrays.asList("ab", "abc",
				"ab", "abcd", "abcdef");
		System.out.println(findeUnique(strings));

	}

}
