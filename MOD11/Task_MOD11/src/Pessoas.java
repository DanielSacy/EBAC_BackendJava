import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoas {
    private String name;
    private String genre; 
    // private String typeName; 
    // private String typeGenre; 

    Scanner info = new Scanner(System.in);

    public Pessoas(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    // public String typeName() {
    //     return info.nextLine();
    // }

    // public String typeGenre() {
    //     return info.nextLine();
    // }
    
    List<String> masculino = new ArrayList<>();
    List<String> feminino = new ArrayList<>();
    
}
