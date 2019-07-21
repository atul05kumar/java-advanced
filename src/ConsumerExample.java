import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * The class contains code explaining how Consumer Interface in Java works.
 * How it is implemented using lambda expressions.
 */
public class ConsumerExample {

    List<Integer> myList = Arrays.asList(1,6,4,2,6,11,75);

    public void consumerDemo() {

        /*forEach uses Consumer Interface implementation
        * */
        System.out.println("\nConsumer example : ");
        Consumer<Integer> consumer = new ConsumerImpl();
        myList.forEach(consumer);
    }
}

/*There is only one method in the consumer interface, hence it is functional interface
* This allows us to use lambda expression to write the implementation inline.
* */
class ConsumerImpl implements Consumer<Integer> {

    public void accept(Integer i) {
        System.out.print(i + " ");
    }
}

