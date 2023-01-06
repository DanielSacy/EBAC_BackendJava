package main.dao;

import java.util.List;

import main.domain.Produto;

public interface IProdutoDao {

    Integer cadastrarProduto(Produto produto) throws Exception;

    Produto consultarProduto(String codigo) throws Exception;

    Integer excluir(Produto produtoDB) throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Integer atualizarProduto(Produto produtoDB) throws Exception;

}
