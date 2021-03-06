package wednesday.wordscounter;

import java.util.HashMap;
import java.util.Map;

import wednesday.readblehashmap.HumanReadableHashMap;

public class TextUtil {
	public static Map<String, Integer> createWordHistogram(String text) {
		Map<String, Integer> histogram = new HashMap<>();
		String[] words = text.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (!histogram.containsKey(words[i])) {
				histogram.put(word, 1);
			} else {
				histogram.put(word, histogram.get(word) + 1);
			}
		}
		return histogram;
	}

	public static String printHistogram(
			Map<? extends Object, ? extends Object> histogram) {
		return HumanReadableHashMap
				.printHashMap((HashMap<? extends Object, ? extends Object>) histogram);
	}
}
