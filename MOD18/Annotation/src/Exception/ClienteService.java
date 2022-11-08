package Exception;

public class ClienteService {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        ClienteDAO.consultarCliente(codigo);
    }

}
