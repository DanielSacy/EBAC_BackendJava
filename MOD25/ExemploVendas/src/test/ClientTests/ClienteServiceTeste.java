package ClientTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Dao.ClienteDAO;
import Dao.IClienteDAO;
import Domain.Cliente;
import Exceptions.TipoChaveNaoEncontradaException;
import Mock.ClienteDAOMock;
import Services.ClienteService;
import Services.IClienteService;

public class ClienteServiceTeste {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTeste() {
        IClienteDAO daoMock = new ClienteDAOMock();
        clienteService = new ClienteService(daoMock);
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(1234567891L);
        cliente.setNome("Daniel");
        cliente.setCidade("Curitiba");
        cliente.setEnd("rua do Limão");
        cliente.setNumero(05);
        cliente.setEstado("Paraná");
        cliente.setTel(5555555L);

    }
    
    @Test
    public void pesquisarCliente() {
        
        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
        
        Assert.assertNotNull(clienteConsultado);        
    }
    
    @Test
    public void salvarClienteTeste() throws TipoChaveNaoEncontradaException{
        Boolean result = clienteService.cadastrar(cliente);
        Assert.assertTrue(result);
    }

    @Test
    public void alterarClienteTeste() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Asdrúbal");
        clienteService.alterar(cliente);
        Assert.assertEquals("Asdrúbal", cliente.getNome());
    }

    @Test
    public void excluirClienteTeste(){
        clienteService.excluir(cliente.getCpf());
    }

}
