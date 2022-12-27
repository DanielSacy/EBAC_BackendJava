package ClientTests;

import org.junit.*;

import Dao.ClienteDAO;
import Dao.IClienteDAO;
import Domain.Cliente;
import Exceptions.TipoChaveNaoEncontradaException;
import Mock.ClienteDAOMock;

public class ClienteDAOTeste {

    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTeste(){
        clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException{
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setNome("Daniel");
        cliente.setCidade("Curitiba");
        cliente.setEnd("rua do Limão");
        cliente.setNumero(05);
        cliente.setEstado("Paraná");
        cliente.setTel(5555555L);

        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarClienteTeste() throws TipoChaveNaoEncontradaException{
        Boolean result = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(result);
     }

    @Test
    public void alterarClienteTeste() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Tioplack");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("Tioplack", cliente.getNome());
    }

    @Test
    public void excluirClienteTeste(){
        clienteDAO.excluir(cliente.getCpf());
    }
    
}
