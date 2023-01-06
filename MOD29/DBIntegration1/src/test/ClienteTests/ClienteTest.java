package test.ClienteTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import main.dao.ClienteDao;
import main.dao.IClienteDao;
import main.domain.Cliente;

public class ClienteTest {
    
    // Testa CADASTRAR, CONSULTAR e EXCLUIR
    @Test
    public void cadastrarClienteTest() throws Exception{
        IClienteDao dao = new ClienteDao(); 
        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Daniel");
        
        Integer count = dao.cadastrarCliente(cliente);
        assertTrue(count == 1);
        
        Cliente clienteDB = dao.consultarCliente(cliente.getCodigo());
        assertNotNull(clienteDB);
        assertNotNull(clienteDB.getId());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        assertEquals(cliente.getNome(), clienteDB.getNome());

        Integer countDelete = dao.excluir(clienteDB);
        assertTrue(countDelete >= 1);
    }

    @Test
    public void buscarTodosClienteTest() throws Exception{
        IClienteDao dao = new ClienteDao(); 
        Cliente cliente = new Cliente();

        cliente.setCodigo("101");
        cliente.setNome("Daniel");
        Integer count = dao.cadastrarCliente(cliente);
        assertTrue(count == 1);

        cliente.setCodigo("20");
        cliente.setNome("Josefa");
        Integer count2 = dao.cadastrarCliente(cliente);
        assertTrue(count == 1);

        List<Cliente> listTeste = dao.buscarTodos();
        assertNotNull(listTeste);
        assertEquals(2, listTeste.size());
        
        Integer countDelete = 0;
        for(Cliente clienteDB : listTeste) {
            dao.excluir(clienteDB);
            countDelete++;
        }
        listTeste = dao.buscarTodos();
        assertEquals(listTeste.size(), 0);
    }

    @Test
    public void atualizarClienteTest() throws Exception{
        IClienteDao dao = new ClienteDao(); 
        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Daniel");
        
        Integer count = dao.cadastrarCliente(cliente);
        assertTrue(count == 1);
        
        Cliente clienteDB = dao.consultarCliente(cliente.getCodigo());
        assertNotNull(clienteDB);
        assertNotNull(clienteDB.getId());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        assertEquals(cliente.getNome(), clienteDB.getNome());
        
        clienteDB.setCodigo("40");
        clienteDB.setNome("Robersval");
        Integer countUpadate = dao.atualizarCliente(clienteDB);
        assertTrue(count == 1);


        Integer countDelete = dao.excluir(clienteDB);
        assertTrue(countDelete >= 1);
    }






}
