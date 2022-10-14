package Agregação;

public class Vendedor {
    private Double comissão;
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComissão() {
        return comissão;
    }

    public void setComissão(Double comissão) {
        this.comissão = comissão;
    }

    public void vende() {
        System.out.println("Vender");

    }

}
