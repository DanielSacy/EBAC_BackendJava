package AdapterPattern;

import java.io.File;

public interface IPersistenciaFiles {
    public void gravar(File file);

    public File read(String path);

}
