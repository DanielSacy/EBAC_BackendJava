package test.ProdutoTestes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import main.dao.IProdutoDao;
import main.dao.ProdutoDao;
import main.domain.Produto;

public class ProdutoTest {
    
    // Testa CADASTRAR, CONSULTAR e EXCLUIR
    @Test
    public void cadastrarProdutoTest() throws Exception{
        IProdutoDao dao = new ProdutoDao(); 
        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("geladeira");
        
        Integer count = dao.cadastrarProduto(produto);
        assertTrue(count == 1);
        
        Produto produtoDB = dao.consultarProduto(produto.getCodigo());
        assertNotNull(produtoDB);
        assertNotNull(produtoDB.getId());
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        Integer countDelete = dao.excluir(produtoDB);
        assertTrue(countDelete >= 1);
    }

    @Test
    public void buscarTodosProdutosTest() throws Exception{
        IProdutoDao dao = new ProdutoDao(); 
        Produto produto = new Produto();

        produto.setCodigo("10");
        produto.setNome("Geladeira");
        Integer count = dao.cadastrarProduto(produto);
        assertTrue(count == 1);

        produto.setCodigo("20");
        produto.setNome("TV");
        Integer count2 = dao.cadastrarProduto(produto);
        assertTrue(count == 1);

        List<Produto> prodList = dao.buscarTodos();
        assertNotNull(prodList);
        assertEquals(2, prodList.size());
        
        Integer countDelete = 0;
        for(Produto produtoDB : prodList) {
            dao.excluir(produtoDB);
            countDelete++;
        }

        prodList = dao.buscarTodos();
        assertEquals(prodList.size(), 0);
    }

    @Test
    public void atualizarProdutoTest() throws Exception{
        IProdutoDao dao = new ProdutoDao(); 
        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("Daniel");
        
        Integer count = dao.cadastrarProduto(produto);
        assertTrue(count == 1);
        
        Produto produtoDB = dao.consultarProduto(produto.getCodigo());
        assertNotNull(produtoDB);
        assertNotNull(produtoDB.getId());
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());
        
        produtoDB.setCodigo("40");
        produtoDB.setNome("Robersval");
        Integer countUpadate = dao.atualizarProduto(produtoDB);
        assertTrue(count == 1);


        Integer countDelete = dao.excluir(produtoDB);
        assertTrue(countDelete >= 1);
    }



}


