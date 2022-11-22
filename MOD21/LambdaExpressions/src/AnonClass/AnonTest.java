package AnonClass;


public class AnonTest{
    public static void main(String[] args) {
        // IMyEventConsumer newConsumer = new IMyEventConsumer() {

        //     @Override
        //     public void consumer(Object value) {
        //         System.out.println(value);                 
        //     }
        // };
        // newConsumer.consumer("Testing again");

        IMyEventConsumer consumerLambda = (Object value) -> System.out.println(value);
        consumerLambda.consumer("Lambda Test");

        receivingInterface((Object value) -> System.out.println(value));

    }

    private static void receivingInterface(IMyEventConsumer consumerLambda) {
        consumerLambda.consumer("Testing from a method");
        
    };

    
}
