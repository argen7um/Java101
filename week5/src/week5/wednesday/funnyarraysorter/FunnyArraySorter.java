package week5.wednesday.funnyarraysorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunnyArraySorter {
	private int pivot;

	public FunnyArraySorter(int pivot) {
		this.pivot = pivot;
	}

	public void reverseOrder(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 < o2 ? 1 : o1 == o2 ? 0 : -1;
			}
		});
	}

	public void pivotSubtractionSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 - pivot) < o2 ? -1 : (o1 - pivot) == o2 ? 0 : 1;
			}
		});
	}

	public void pivotDivisionSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 / pivot) < o2 ? 1 : (o1 / pivot) == o2 ? 0 : -1;
			}
		});
	}

	public int getPivot() {
		return pivot;
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(2);
		l.add(7);
		l.add(9);
		FunnyArraySorter s = new FunnyArraySorter(10);
		s.pivotSubtractionSort(l);
		System.out.println(l);
	}
}
