package Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        // Singleton singleton = Singleton.getInstance();

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonSynchronized singleton = SingletonSynchronized.getInstance("test");
            System.out.println(singleton.getValue());
        }
    }
    
    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonSynchronized singleton = SingletonSynchronized.getInstance("test1");
            System.out.println(singleton.getValue());
        }
    }
}
