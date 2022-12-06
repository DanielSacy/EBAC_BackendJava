package Streams;

import java.util.List;
import java.util.stream.Stream;

public class LimitExamples {
    public static void main(String[] args) {
        List<Pessoa> limitList = new Pessoa().populaPessoas();

        Stream<Pessoa> limitStream = limitList.stream()
                    .limit(3);
        limitStream.forEach(System.out::println);
    }
}
