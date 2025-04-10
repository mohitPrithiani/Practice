import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        add sum = Integer::sum;
        int res = sum.addNums(1,2);
        System.out.println(res);

//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//        // Using map to convert names to their lengths
//        names.stream().map(String::length).forEach(System.out::println);

//        List<List<String>> listOfLists = Arrays.asList(
//                Arrays.asList("Alice", "Bob"),
//                Arrays.asList("Charlie", "Dave"),
//                Arrays.asList("Eve")
//        );
//        // Using flatMap to flatten the lists into a single stream
//        listOfLists.stream().flatMap(Collection::stream).forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(3, 8, 1, 6, 4, 7, 2, 5, 9, 0);
//        // filter a list of integers to find even numbers and sort them
//        numbers.stream().filter(num -> num % 2 == 0).sorted().forEach(System.out::println);


        // Sort a list in descending order
//        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Dave");
//        names.stream().sorted((a, b ) -> b.compareTo(a)).forEach(System.out::println);
    }
}

@FunctionalInterface
interface add {
    int addNums(int a, int b);
}