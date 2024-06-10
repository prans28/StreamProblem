package Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FindOccuranceCharacter {
	public static void main(String[] args) {
		String s = "pranavkumar";
		Map<Character, Long> collect = s.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().forEach(e -> System.out.println(e.getClass() + " " + e.getKey()));
	}

}
