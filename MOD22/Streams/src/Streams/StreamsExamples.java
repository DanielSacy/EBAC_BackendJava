package Streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamsExamples {
    public static void main(String[] args) {
        Stream<String> listExample = List.of("Daniel", "Pedrozo", "Backend").stream();
        
        Stream<String> setExample = Set.of("Daniel", "Pedrozo", "Backend").stream();
        
        Map<Integer, String> mapExample = Map.of(1,"Daniel", 2, "Pedrozo", 3, "Backend");
        Stream<Integer> keyStream = mapExample.keySet().stream();
        Stream<String> valueStream = mapExample.values().stream();

        Stream<Integer> intStream = Stream.of(1,2,3,4,5);



    }
}
