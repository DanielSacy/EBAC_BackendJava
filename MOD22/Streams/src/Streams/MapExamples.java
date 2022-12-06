package Streams;

import java.util.*;
import java.util.stream.*;

public class MapExamples {
    public static void main(String[] args) {

        List<Pessoa> mapListPessoa = new Pessoa().populaPessoas();
        Stream<Integer> mapFunctionStream = mapListPessoa.stream()
                            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                            .map(Pessoa::getIdade);
        mapFunctionStream.forEach(System.out::println);
                            
                            
        IntStream mapFunctionStream2 = mapListPessoa.stream()
                            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                            .mapToInt(Pessoa::getIdade);
    }
}
