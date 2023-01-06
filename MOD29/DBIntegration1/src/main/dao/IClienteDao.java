package main.dao;

import java.util.List;

import main.domain.Cliente;

public interface IClienteDao {
    public Integer cadastrarCliente (Cliente cliente) throws Exception;

    public Cliente consultarCliente(String codigo) throws Exception;

    public Integer excluir(Cliente clienteDB) throws Exception;

    public List<Cliente> buscarTodos() throws Exception;

    public Integer atualizarCliente(Cliente clienteDB) throws Exception; 

}
