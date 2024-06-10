package Stream;

import java.util.Arrays;
import java.util.List;

public class StartWithY {
    public static void main(String[] args) {
		List<String> asList = Arrays.asList("yml" ,"xml" ,"yeild"); 
		asList.stream().filter(e -> e.startsWith("y")).forEach(System.out::println);
	}

}