package TASK_MOD22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class App {
    private static Stream<Entry<String, String>> filterMapGender;

    public static void main(String[] args) {
        Scanner readNameGender = new Scanner(System.in);
        Map<String, String> peopleMap = new HashMap<>();
        

        System.out.println("Would you like to add a person?");


        while(readNameGender.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Type the name: ");
            String name = readNameGender.nextLine();
            System.out.println("Type the gender: M or F ");
            String gender = readNameGender.nextLine();  //.charAt(0);
            peopleMap.put(name, gender);
            
            System.out.println("Would you like to add a person?");

        }


        System.out.println("");
        System.out.println("====Entries===");
        peopleMap.entrySet().stream()
        .forEach(entry -> 
        {System.out.println(entry.getKey() + " " + entry.getValue());}
        );
        
        System.out.println("");
        System.out.println("====Filtered===");
        Stream<Entry<String, String>> filterMapGender = peopleMap.entrySet().stream()
                                    .filter(entry -> entry.getValue().equalsIgnoreCase("f"));
        filterMapGender.forEach(System.out::println);


    }
}
