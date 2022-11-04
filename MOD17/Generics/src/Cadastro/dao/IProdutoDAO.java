package Cadastro.dao;

import java.util.Collection;

import Cadastro.dao.Generic.IGenericDAO;
import Cadastro.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto> {
    
    public Boolean cadastrar(Produto produto);
    
    public void excluir(Long codigo);
    
    public void alterar(Produto produto);
    
    public Produto consultar(Long codigo);

    public Collection<Produto> buscarTodos();   
}
