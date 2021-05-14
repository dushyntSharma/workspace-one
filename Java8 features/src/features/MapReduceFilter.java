package features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduceFilter {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		int res = 0; 
		List<Integer> l2 = new ArrayList<Integer>(list.size());

		for (int i = 0; i < list.size(); i++) {
			int square = list.get(i) * list.get(i);
			if (square > 10)
				l2.add(square);
		}
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i) + " ");
		}
		System.out.println();

		// map and filter
		l2 = list.stream().map(a -> a * a).filter(a -> a >= 10).collect(Collectors.toList()); // (a -> a*a) this is
																								// lamda function
		l2.stream().forEach(a -> System.out.println(a + " "));
		System.out.println();

		// reduce function
		res = list.stream().reduce((a, b) -> {
			System.out.println(a);
			return a * b;
		}).get();
		System.out.println(res);
	}

}
