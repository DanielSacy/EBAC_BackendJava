package Cadastro.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Cadastro.dao.Generic.GenericDAO;
import Cadastro.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoDAO(){
        super();
        Map<Long, Produto> internMap = this.map.get(getClassType());
        if(internMap == null) {
            internMap = new HashMap<>();
            this.map.put(getClassType(), internMap);
        }

    }
    
        @Override
        public Class<Produto> getClassType() {
            return Produto.class;
        }

    @Override
    public Boolean cadastrar(Produto produto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void alterar(Produto produto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {
        // TODO Auto-generated method stub
        
    }


}