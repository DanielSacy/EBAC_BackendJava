/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro.dao;

import java.util.*;

import Cadastro.dao.Generic.GenericDAO;
import Cadastro.domain.Cliente;

/**
 *
 * @author rodrigo.pires
 */
public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> internMap = this.map.get(getClassType());
            if(internMap == null) {
                internMap = new HashMap<>();
                this.map.put(getClassType(), internMap);
            }
    }

    @Override
    public Class<Cliente> getClassType() {
        // TODO Auto-generated method stub
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setEstado(entity.getEstado());

    }
    
//     private Map<Long, Cliente> map;
    
//     public ClienteMapDAO() {
//         map = new TreeMap<>();
//     }

//     @Override
//     public Boolean cadastrar(Cliente cliente) {
//         if (map.containsKey(cliente.getCpf())) {
//             return false;
//         }
        
//         map.put(cliente.getCpf(), cliente);
//         return true;
//     }

//     @Override
//     public void excluir(Long cpf) {
//         Cliente clienteCadastrado = map.get(cpf);
//         map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//     }

//     @Override
//     public void alterar(Cliente cliente) {
//         Cliente clienteCadastrado = map.get(cliente.getCpf());
//         clienteCadastrado.setNome(cliente.getNome());
//         clienteCadastrado.setTel(cliente.getTel());
//         clienteCadastrado.setNumero(cliente.getNumero());
//         clienteCadastrado.setEnd(cliente.getEnd());
//         clienteCadastrado.setCidade(cliente.getCidade());
//         clienteCadastrado.setEstado(cliente.getEstado());
//     }

//     @Override
//     public Cliente consultar(Long cpf) {
//         return this.map.get(cpf);
//     }

//     @Override
//     public Collection<Cliente> buscarTodos() {
//         return this.map.values();
//     }

}
