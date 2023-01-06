package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import main.dao.jdbc.ConnectionFactory;
import main.domain.Produto;

public class ProdutoDao implements IProdutoDao {

    @Override
    public Integer cadastrarProduto(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "INSERT INTO TB_PRODUTO (CODIGO, NOME) VALUES (?,?)";
            sql = connection.prepareStatement(query);
            sql.setString(1, produto.getCodigo());
            sql.setString(2, produto.getNome());
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
    public Produto consultarProduto(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        ResultSet rs = null;
        Produto produto = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM TB_PRODUTO WHERE CODIGO = ?";
            sql = connection.prepareStatement(query);
            sql.setString(1, codigo);
            rs = sql.executeQuery();
            if(rs.next()) {
                produto = new Produto();
                produto.setCodigo(rs.getString("Codigo"));
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
            }
            return produto;
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
    public Integer excluir(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "DELETE FROM TB_PRODUTO WHERE CODIGO = ?";
            sql = connection.prepareStatement(query);
            sql.setString(1, produto.getCodigo());
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
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        ResultSet rs = null;
        List<Produto> produtoList = new ArrayList<>();
        Produto produto = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM TB_PRODUTO";
            sql = connection.prepareStatement(query);
            rs = sql.executeQuery();
            while(rs.next()) {
                produto = new Produto();
                String codigo = rs.getString("Codigo");
                Long id = rs.getLong("id");
                String nome = rs.getString("nome");
                produto.setCodigo(codigo);
                produto.setId(id);
                produto.setNome(nome);
                produtoList.add(produto);
            }
            return produtoList;
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
    public Integer atualizarProduto(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement sql = null;
        try{
            connection = ConnectionFactory.getConnection();
            String query = "UPDATE TB_PRODUTO SET CODIGO=?, NOME=? WHERE ID=?";
            sql = connection.prepareStatement(query);
            sql.setString(1, produto.getCodigo());
            sql.setString(2, produto.getNome());
            sql.setLong(3, produto.getId());
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

