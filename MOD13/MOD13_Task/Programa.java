package MOD13_Task;

public class Programa {
    
    public static void main(String args[]) {
        PessoaFisica pessoa1 = new PessoaFisica();
        PessoaJuridica pessoa2 = new PessoaJuridica();

        pessoa1.setNome("José");
        pessoa1.setCPF("555.555.555-55");

        pessoa2.setNome("Açougue do João");
        pessoa2.setCNPJ("33.333.333/0003-3");
    }
}
