import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        /*Invoking a function for each element of stream*/
        IntStream
                .range(1, 10)
                .forEach(System.out::print);

        System.out.println();

        /*Invoking a function for each element of the stream using lambda notation
        * Use of skip intermediate operation.
        * */
        IntStream.range(1, 10)
                .skip(5)
                .forEach(x -> System.out.print(x));

        System.out.println();

        /*Use of sum terminal operation*/
        int sumOfOneToNine = IntStream
                .range(1,10)
                .sum();
        System.out.println(sumOfOneToNine);

        /*Using stream of*/
        Stream.of("Verma", "Kumar", "Atul")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        /*Arrays stream, filter, sort and print*/
        String [] names = {"Gaurav", "Atul", "Ritesh", "Nidhi", "Lucky", "Tanu", "Ritu", "Gutti"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        /*Using average terminal operation and map intermediate operation*/
        Arrays.stream(new int[] {3, 5, 2, 8, 1, 0})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        /*Using stream of list*/
        List<String> people = Arrays.asList("Atul", "nidhi", "Tanu", "Ritu", "Charu", "Deepak", "Gaurav", "Ritesh");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("r"))
                .forEach(System.out::println);

        /*More examples using filter*/
        people.stream()
                .filter(x -> x.length() > 4)
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        /*Collect terminal operation*/
        List <String> newPeople = people.stream()
                .filter(x -> x.contains("u"))
                .map(x -> x + " ")
                .collect(Collectors.toList());
        newPeople.forEach(x -> System.out.print(x));

        /*More complex example*/
        List<String> numbers = Arrays.asList("1,2,4", "3,5,7", "A", "7,3,9");
        int recordsWithThreeNums = (int)numbers.stream()
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(recordsWithThreeNums);



    }
}
