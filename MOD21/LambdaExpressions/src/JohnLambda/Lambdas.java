package JohnLambda;

public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();

        System.out.println("");

        printThing(myCat);

        System.out.println("");

        printThing(
            () -> System.out.println("Meow"));

        System.out.println("");

        IPrintable lambdaPrint = () -> System.out.println("Meow");
        printThing(lambdaPrint);

        System.out.println("");

        IPrintableParam lambdaPrintParam = s -> System.out.println("Meow" + s);
        printThing2(lambdaPrintParam);

    }

    static void printThing(IPrintable thing) {
        thing.print();
    }

    static void printThing2(IPrintableParam thing) {
        thing.print("!");
    }
}
