package tests.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.dao.CursoDao;
import main.java.dao.ICursoDao;
import main.java.domain.Curso;

public class CursoTest {
    
    private CursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrarCurso() {
        Curso curso = new Curso();
        curso.setCodigo("C1");
        curso.setDescricao("Computer Science 101");
        curso.setNome("CS101");
        curso = cursoDao.cadastrarCurso(curso);
        // assertNotNull(curso);
        // assertNotNull(curso.getId());

    }

}
