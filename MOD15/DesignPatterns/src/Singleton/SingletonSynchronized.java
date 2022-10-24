package Singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized singleton; // Refers himself
    private String value;

    private SingletonSynchronized(String value) { // Private constructor
        this.value = value;
    }

    public static synchronized SingletonSynchronized getInstance(String value) {
        if(singleton == null) {
            singleton = new SingletonSynchronized(value);
        }
        return singleton;
    }

    public String getValue(){
        return value;
    }
}


