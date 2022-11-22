package JohnAnnonymousClasses;


public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();

        Animal bigFoot = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Foooooty");
            }
        };
        bigFoot.makeNoise();

        Runnable myRunnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous implementing an interface");
            }            
        };
        myRunnable.run();


    }
}
