package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        System.out.println("===ForEach===");
        pessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));
        pessoas.stream().forEach(System.out::println);
        
        System.out.println("===count===");
        System.out.println(pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("A"))
        .count());
        
        System.out.println("===allMatch/anyMatch===");
        System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil")));
        System.out.println(pessoas.stream().anyMatch(pessoa -> pessoa.getNacionalidade().equals("Brasil")));
        
        System.out.println("===collect===");
        System.out.println("===List===");
        pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("A"))
        .collect(Collectors.toList())
        .forEach(pessoa -> System.out.println(pessoa.getNome()));
        
        System.out.println("===Set===");
        pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("A"))
        .collect(Collectors.toSet())
        .forEach(pessoa -> System.out.println(pessoa.getNome()));
        
        System.out.println("===ArrayList===");
        pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("A"))
        .collect(Collectors.toCollection(ArrayList::new))
        .forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("===MAP===");
        pessoas.stream()
        .filter(pessoa -> pessoa.getNome().startsWith("D"))
        .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new))
        .forEach((k,v) -> System.out.println(v.getNome()));
        
        System.out.println("===GroupingBY===");
        pessoas.stream()
        // .filter(pessoa -> pessoa.getNome().startsWith("D"))
        .collect(Collectors.groupingBy(Pessoa::getNacionalidade))
        .forEach((k,v) -> System.out.println(v));
        
        System.out.println("===GroupingBY===");
        pessoas.stream()
        // .filter(pessoa -> pessoa.getNome().startsWith("D"))
        .collect(Collectors.groupingBy(pessoa -> pessoa.getNacionalidade()))
        .forEach((k,v) -> System.out.println(v));
        
        System.out.println("===Optional/MAX===");
        pessoas.stream()
        // .filter(pessoa -> pessoa.getNome().startsWith("D"))
        .max(Comparator.comparing(Pessoa::getIdade))
        .ifPresent(System.out::println);
        
        System.out.println("===Optional/MAX===");
        pessoas.stream()
        // .filter(pessoa -> pessoa.getNome().startsWith("D"))
        .min(Comparator.comparing(Pessoa::getIdade))
        .ifPresentOrElse(System.out::println, search());
        


    }

    private static Runnable search() {
        // To search for the parameter in another site
        return null;
    }
}
