package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_ {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4);

		List<Integer> collect = asList.stream().map(e -> e * e).collect(Collectors.toList());
		collect.forEach(e -> System.err.println(e));
	}
}