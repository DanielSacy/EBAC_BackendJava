package Agregação;

public class Produto {
    private Double preço;
    private String nome;
    private Long codigo;

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
        
    public void vendido() {
        System.out.println("Vendido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long código) {
        this.codigo = codigo;
    }



}
