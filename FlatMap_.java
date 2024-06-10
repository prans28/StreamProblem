package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		  List<List<List<Integer>>> asList = Arrays.asList(	
				Arrays.asList(Arrays.asList(1,2,3,4),
						      Arrays.asList(1,2,3,4)						      
						), 				
				Arrays.asList(Arrays.asList(1,2,3,4),
					         Arrays.asList(1,2,3,4)));
		  
		List<Integer> collect = asList.stream()
				.flatMap(e -> e.stream()
						.flatMap(x -> x.stream())).collect(Collectors.toList());
		collect.forEach(e -> System.out.print(e+" "));

	}
}
