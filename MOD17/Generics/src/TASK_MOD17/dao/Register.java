package TASK_MOD17.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import TASK_MOD17.domain.DB;

public abstract class Register<T extends DB> implements IRegister<T>{

    protected Map<Class, Map<Long, T>> carRegister;
    public abstract Class<T> getClassType();

    public Register() {
        if(this.carRegister == null) {
            this.carRegister = new HashMap<>();
        }
    }


    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> carRegister = this.carRegister.get(getClassType());
        if (carRegister.containsKey(entity.getCode())) {
            return false;
        }
        carRegister.put(entity.getCode(), entity);
        return true;
    }

    @Override
    public void excluir(Long codigo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void alterar(T entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T consultar(Long code) {
        Map<Long, T> carRegister = this.carRegister.get(code);
        return carRegister.get(code);
        }

    @Override
    public Collection<T> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}
