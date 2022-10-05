import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Ler nomes do console separados por víruglas;
// Guardar em uma VAR, ordernar alfabeticamente e printar no console;
// Ler Nome - M/F separados por vírgulas;
// Guardar em uma VAR e separar por grupos;
public class Task_MOD12 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("*********PARTE I*********");

        System.out.println("Digite nomes separados por ',' : ");
        String[] typedNames = info.nextLine().split(",");
        for(String name : typedNames){
            names.add(name);
        };
        
        Collections.sort(names);
        
        for(String name : names ) {
            System.out.println(name);
        }

        System.out.println("*********PARTE II*********");

        List<String> namesGenres = new ArrayList<>();
        List<String> namesM = new ArrayList<>();
        List<String> namesF = new ArrayList<>();


        System.out.println("Digite nomes e gêneros separados por ',' no estilo (Nome - M/F): ");
        String[] typedNamesGenres = info.nextLine().split(",");
        for(String nameGenre : typedNamesGenres){
            namesGenres.add(nameGenre);
        };
 //       for(String namesTest : namesGenres ) {
 //           System.out.print("[" + namesTest + "], ");

        for(String genre : namesGenres) {
            if(genre.substring(genre.length() - 1).equalsIgnoreCase("m")) {
                namesM.add(genre);
            } else if(genre.substring(genre.length() - 1).equalsIgnoreCase("f")) {
                namesF.add(genre);
            } else {System.out.println("\nGênero incorreto digitado! O estilo deve ser (Nome - M/F)\n\n");
                continue;
            }
        }
        System.out.print("Nomes masculinos: ");
        for(String nameM : namesM ) {
            System.out.print("[" + nameM + "] ");
        }
        System.out.print("\n\n");
        
        System.out.print("Nomes femininos: ");
        for(String nameF : namesF ) {
            System.out.print("[" + nameF + "] ");
        }
        System.out.print("\n\n");
    }
}  
   

