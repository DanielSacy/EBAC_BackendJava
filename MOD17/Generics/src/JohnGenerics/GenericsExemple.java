package JohnGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExemple {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(42);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(42.0);
        doublePrinter.print();
        System.out.println();


        AnimalPrinter catPrinter = new AnimalPrinter<>(new Cat("Julio"));
        catPrinter.print();
        AnimalPrinter dogPrinter = new AnimalPrinter<>(new Dog("Afonso"));
        dogPrinter.print();

        System.out.println();

        shout("Daniel", "Dios mio");
        shout(49.0, "Olá");

        System.out.println();

        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        printList(intList);

    }

    private static <T, V> void shout (T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");    
        System.out.println(otherThingToShout + "!!!!");    
    }

    private static void printList(List<?> myList) {
        System.out.println();    

    }
}