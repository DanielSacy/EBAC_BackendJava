package Streams;

import java.util.List;
import java.util.stream.Stream;

public class DistinctExamples {
    public static void main(String[] args) {
        List<Pessoa> distinctList = new Pessoa().populaPessoas();

        Stream<Pessoa> distinctStream = distinctList.stream()
                    .distinct();


    }
}
