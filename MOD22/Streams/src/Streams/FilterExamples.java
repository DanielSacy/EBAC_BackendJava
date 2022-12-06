package Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterExamples {
    public static void main(String[] args) {
        List<Pessoa> listPessoa = new Pessoa().populaPessoas();
        Predicate<Pessoa> nacionalidadeTeste = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        Stream<Pessoa> nacionalidadePredic = listPessoa.stream().filter(nacionalidadeTeste);

        //Common way
        Stream<Pessoa> nacionalidade = listPessoa.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));
        // nacionalidade.forEach(pessoa -> System.out.println(pessoa));
        // nacionalidade.forEach(System.out::println);
        nacionalidade.peek(pessoa -> System.out.println(pessoa)).count();
        


    }
}
