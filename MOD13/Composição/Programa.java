package Composição;

public class Programa {
    public static void main(String args[]) {
     Banco banco = new Banco();
     banco.setCodigo(01L);
     banco.setNome("Sacy");

     ContaCorrente cc = new ContaCorrente();
     cc.setBanco(banco);
     cc.setSaldo(1000d);

     ContaPoupança cp = new ContaPoupança();
     cp.setBanco(banco);
     cp.setSaldo(10d);


    }
}
