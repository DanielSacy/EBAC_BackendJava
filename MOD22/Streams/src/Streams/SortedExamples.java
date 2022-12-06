package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedExamples {
    public static void main(String[] args) {
        List<Pessoa> sortedList = new Pessoa().populaPessoas();

        Stream<Pessoa> sortedStream = sortedList.stream()
                    .sorted(Comparator.comparing(Pessoa::getIdade));
        sortedStream.forEach(Pessoa -> System.out.println(Pessoa.getNome() + " " + Pessoa.getIdade()));


        Stream<Pessoa> sortedStream2 = sortedList.stream()
                    .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
        sortedStream2.forEach(Pessoa -> System.out.println(Pessoa.getNome() + " " + Pessoa.getIdade()));


    }
}
