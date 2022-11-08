package Exception;

public class ClienteDAO {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        //Simulating DB search
        Boolean isCadastrado = false;

        if(!isCadastrado) {
            throw new ClienteNaoEncontradoException("Cliente não encontrado");
        }
    }
}