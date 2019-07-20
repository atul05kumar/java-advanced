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

        


    }
}
