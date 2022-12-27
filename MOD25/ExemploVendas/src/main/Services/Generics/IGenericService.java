package Services.Generics;

import Domain.Persistente;
import Exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService<T extends Persistente> {
    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    //Boolean cadastrar(Long valor);

    T consultar(Long valor);

    void excluir(Long valor);

    void alterar(T entity) throws TipoChaveNaoEncontradaException;
    
}
