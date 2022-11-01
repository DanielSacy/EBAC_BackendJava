package ObserverMethod;

public class Demo {
    public static void main(String[] args) {
        Journalist journalist = new Journalist();
        journalist.add(new TV());
        journalist.notifyAll("test");
    }
}
