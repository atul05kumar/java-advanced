import java.util.Arrays;
import java.util.List;

/**
 * Class explaining lambda expressions.
 * Note : Lambda expressions only work with implementing interfaces with only only method.
 * These interfaces are termed as functional interfaces.
 */
public class LamdaExamples{
    /*Normal Invocation using an implementation of interface written in a class*/
    public void normalInvocation() {
        ShowLine s = new ShowLineImpl();
        s.show();
    }

    /*Normal Java forEach using lambda function*/
    public void exampleLamdaInJava() {
        List<Integer> myList = Arrays.asList(1,6,4,2,6,11,75);
        myList.forEach(i -> System.out.print(i + " "));
    }

    /*Provided implementation as an inner class during object creation*/
    public void anonymousInnterClass() {
        ShowLine s = new ShowLine() {
            public void show() {
                System.out.println("Show inside Anonymous inner class!");
            }
        };
        s.show();
    }

    public void detailedLambdaExpression() {
        /*Since method signature is already present in the interface
        * And there is only one method defined in the interface,
        * hence we can remove the method name and return type.
        * Instead we can use the -> to link body of function to anonymous function.
        * */
        ShowLine s = () -> {
            System.out.println("Show inside of detailed Lambda expression!");
        };
        s.show();
    }

    public void lambdaWithMethodParams() {
        ShowLineWithParm s = (int i) -> {
            System.out.println("Show with parm inside detailed lambda expression!" + i);
        };

        s.show(7);
    }

    /*Since the method body has only one statement, we can remove the curly braces
    * Since there is only one argument in the method, we can remove the small braces.
    * Since in the interface, we already told the type of argument, we need not mention it in the implementation.
    * */
    public void lamdaWithMethodParmShortExpression() {
        ShowLineWithParm s = i -> System.out.println("Show inside method parm short expression! " + i);
        s.show(8);
    }

}

class ShowLineImpl implements ShowLine {
    public void show() {
        System.out.println("Show inside of regular implementation class!");
    }
}

interface ShowLine {
    void show();
}

interface ShowLineWithParm {
    void show(int i);
}

