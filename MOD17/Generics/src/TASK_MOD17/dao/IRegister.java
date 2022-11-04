package TASK_MOD17.dao;

import java.util.Collection;

import TASK_MOD17.domain.DB;

public interface IRegister<T extends DB> {
    public Boolean cadastrar(T entity);
    
    public void excluir(Long code);
    
    public void alterar(T entity);
    
    public T consultar(Long code);

    public Collection<T> buscarTodos();   
}
