package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import main.dao.jdbc.ConnectionFactory;
import main.domain.Cliente;

public class ClienteDao implements IClienteDao {

    @Override
    public Integer cadastrarCliente(Cliente cliente) throws Exception{
        Connection connection = null;
        PreparedStatement sql = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "INSERT INTO TB_CLIENTE (CODIGO, NOME) VALUES (?,?)";
            sql = connection.prepareStatement(query);
            sql.setString(1, cliente.getCodigo());
            sql.setString(2, cliente.getNome());
            return sql.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if(sql != null && !sql.isClosed()) {
                sql.close();
            }
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Cliente consultarCliente(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM TB_CLIENTE WHERE CODIGO = ?";
            sql = connection.prepareStatement(query);
            sql.setString(1, codigo);
            rs = sql.executeQuery();
            if(rs.next()) {
                cliente = new Cliente();
                cliente.setCodigo(rs.getString("Codigo"));
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
            }
            return cliente;
        } catch(Exception e) {
            throw e;
        } finally {
            if(sql != null && !sql.isClosed()) {
                sql.close();
            }
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "DELETE FROM TB_CLIENTE WHERE CODIGO = ?";
            sql = connection.prepareStatement(query);
            sql.setString(1, cliente.getCodigo());
            return sql.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if(sql != null && !sql.isClosed()) {
                sql.close();
            }
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        ResultSet rs = null;
        List<Cliente> clienteList = new ArrayList<>();
        Cliente cliente = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM TB_CLIENTE";
            sql = connection.prepareStatement(query);
            rs = sql.executeQuery();
            while(rs.next()) {
                cliente = new Cliente();
                cliente.setCodigo(rs.getString("Codigo"));
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                clienteList.add(cliente);
            }
            return clienteList;
        } catch(Exception e) {
            throw e;
        } finally {
            if(sql != null && !sql.isClosed()) {
                sql.close();
            }
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizarCliente(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "UPDATE TB_CLIENTE SET CODIGO=?, NOME=? WHERE ID=?";
            sql = connection.prepareStatement(query);
            sql.setString(1, cliente.getCodigo());
            sql.setString(2, cliente.getNome());
            sql.setLong(3, cliente.getId());
            return sql.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if(sql != null && !sql.isClosed()) {
                sql.close();
            }
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

}
