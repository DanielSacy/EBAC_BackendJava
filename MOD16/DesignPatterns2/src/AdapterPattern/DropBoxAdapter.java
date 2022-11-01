package AdapterPattern;

import java.io.File;

public class DropBoxAdapter implements IPersistenciaFiles{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        // TODO Auto-generated method stub
        dropBox.upload(new DropBoxFile(file.getAbsolutePath()));
    }

    @Override
    public File read(String path) {
        // TODO Auto-generated method stub
        DropBoxFile file = dropBox.download(path);
        return new File(file.getLocalPath());
    }
    
}
