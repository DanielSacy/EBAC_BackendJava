package AdapterPattern;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String file = "teste.txt";
        DropBox dropBox = new DropBox();
        IPersistenciaFiles files = new DropBoxAdapter(dropBox);
        files.gravar(new File(file));
    }
}
