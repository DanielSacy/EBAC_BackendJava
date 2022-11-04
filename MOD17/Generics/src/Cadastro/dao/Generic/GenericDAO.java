package Cadastro.dao.Generic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

import Cadastro.domain.Persistente;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{
    protected Map<Class, Map<Long, T>> map;

    public GenericDAO() {
        if(this.map == null) {
            this.map = new HashMap<>();
        }
    }

    public abstract Class<T> getClassType();
    public abstract void atualizarDados(T entity, T entityCadastrado);
    
    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> internMap = this.map.get(getClassType());
        if (internMap.containsKey(entity.getCodigo())) {
            return false;
        }
        internMap.put(entity.getCodigo(), entity);
        return true;    
    }
    
    @Override
    public void excluir(Long codigo) {
        Map<Long, T> internMap = this.map.get(getClassType());
        T entityCadastrado = internMap.get(codigo);
        if(entityCadastrado != null) {
            this.map.remove(codigo, entityCadastrado);
        }                
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> internMap = this.map.get(getClassType());
        T entityCadastrado = internMap.get(entity.getCodigo());
        if(entityCadastrado != null){
            atualizarDados(entity, entityCadastrado);
        }
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> internMap = this.map.get(getClassType());
        return internMap.values();
    }


    @Override
    public T consultar(Long codigo) {
        Map<Long, T> internMap = this.map.get(getClassType());
        return internMap.get(codigo);
    }

    
}
