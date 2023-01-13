import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import dao.CursoDAO;
import dao.ICursoDAO;
import domain.Curso;

public class CursoTest {
    
    private ICursoDAO cursoDAO;

    public CursoTest() {
        cursoDAO = new CursoDAO();
    }

    @Test
    public void cadastrarCurso(){
        Curso curso = new Curso();
        curso.setCodigo("C1");
        curso.setDescricao("Computer Science 101");
        curso.setNome("CS101");
        curso = cursoDAO.cadastrarCurso(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());

    }
}
