package Singleton;

public class Singleton {
    private static Singleton singleton; // Refers himself

    private Singleton() { // Private constructor

    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
