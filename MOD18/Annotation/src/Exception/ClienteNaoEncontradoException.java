package Exception;

public class ClienteNaoEncontradoException extends Exception{
    public ClienteNaoEncontradoException(String msg) {
        super(msg); //Because Exception class receives a msg too
    }
}