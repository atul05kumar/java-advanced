import java.util.stream.IntStream;

public class StreamExamples {
    public static void main(String[] args) {
        /*Invoking a function for each element of stream*/
        IntStream
                .range(1, 10)
                .forEach(System.out::print);



    }
}
