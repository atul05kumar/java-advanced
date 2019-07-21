public class Main {
    public static void main(String[] args) {
        StreamExamples stream = new StreamExamples();
        stream.streamDemo();

        LamdaExamples lambda = new LamdaExamples();
        lambda.normalInvocation();
        lambda.anonymousInnterClass();
        lambda.detailedLambdaExpression();
        lambda.lambdaWithMethodParams();
        lambda.lamdaWithMethodParmShortExpression();
        lambda.exampleLamdaInJava();

        ConsumerExample consumerExample = new ConsumerExample();
        consumerExample.consumerDemo();



    }
}
