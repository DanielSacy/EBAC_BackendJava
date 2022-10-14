package Composição;

public class ContaCorrente {
    private Banco banco;
    private Double saldo;
    private Double chequeEspecial;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public Double getchequeEspecial() {
        return chequeEspecial;
    }

    public void setchequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Banco getBanco() { 
        return banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

}
