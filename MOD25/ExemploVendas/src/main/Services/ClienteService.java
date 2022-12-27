package Services;

import Dao.ClienteDAO;
import Dao.IClienteDAO;
import Domain.Cliente;
import Domain.Persistente;
import Exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService {
    IClienteDAO clienteDAO;
    
    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(entity);
    }

    // @Override
    // public Boolean cadastrar(Long valor) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    @Override
    public Cliente consultar(Long valor) {
        return clienteDAO.consultar(valor);
    }

    @Override
    public void excluir(Long valor) {
        clienteDAO.excluir(valor);
        
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(entity);
        
    }



    // @Override
    // public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
    //     return clienteDAO.cadastrar(cliente);    
    // }

    // @Override
    // public Cliente buscaPorCpf(Long cpf) {
    //     return clienteDAO.consultar(cpf);
        
    // }

    // @Override
    // public void excluir(Long cpf) {
    //     clienteDAO.excluir(cpf);        
    // }

    // @Override
    // public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
    //     clienteDAO.alterar(cliente);        
    // }
    
}