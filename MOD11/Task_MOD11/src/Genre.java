import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Genre {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        Pessoas pessoa = new Pessoas(null, null);

        System.out.println("Quer adicionar pessoa?");
        String answer = info.nextLine();


        while (answer.equalsIgnoreCase("Sim")) {
            System.out.println("Digite o nome: ");
            String typeName = info.nextLine();
            System.out.println("Digite o gênero: ");
            String typeGenre = info.nextLine();

            pessoa.setName(typeName);
            pessoa.setGenre(typeGenre);
            System.out.println(pessoa.getGenre());
            
            if (pessoa.getGenre().equalsIgnoreCase("Masculino")) {
                pessoa.masculino.add(pessoa.getName());
            } else {pessoa.feminino.add(pessoa.getName());
                }
            
            System.out.println("Quer adicionar pessoa?");
            answer = info.nextLine();
        }
        System.out.println("Lista masculina: " + pessoa.masculino);
        System.out.println("Lista feminina: " + pessoa.feminino);
    }
}