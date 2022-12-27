package Dao;

import Dao.Generics.GenericDAO;
import Domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    @Override
    public Class<Cliente> getTipoClasse() {
        // TODO Auto-generated method stub
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        // TODO Auto-generated method stub
        
    }



}
