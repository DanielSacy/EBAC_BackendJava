package AnonClass;

public class MethodReference {
    public static void main(String[] args) {
        IMyEventConsumer event = System.out::println;
        event.consumer("Wow! its getting complicated");
    }
}
