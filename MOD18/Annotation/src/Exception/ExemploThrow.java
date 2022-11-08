package Exception;

public class ExemploThrow {
    public static void saque(double valor) throws LimiteSaqueException {
        if(valor > 400) {
            LimiteSaqueException erro = new LimiteSaqueException("Valor Solicitado maior que o limite.");
            throw erro;
        } else {
            System.out.println("Valor retirado da conta $"+ valor);
        }
    }

    public static void saqueRunTimeException(double valor) {
        if(valor > 400) {
            IllegalArgumentException erro = new IllegalArgumentException("Valor solicitado maior que limite."); 
            throw erro;
        }else {
            System.out.println("Valor retirado da conta $"+ valor);
        }
    }
}
