package Composição;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupança> contasPoupancas;

    private Long codigo;
    private String nome;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupancas = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contasCorrentes.add(cc);
    }
    
    public void add(ContaPoupança cp) {
        this.contasPoupancas.add(cp);
    }

    public Set<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }

    public void setContasCorrentes(Set<ContaCorrente> contasCorrentes) {
        this.contasCorrentes = contasCorrentes;
    }

    public Set<ContaPoupança> getContasPoupancas() {
        return contasPoupancas;
    }

    public void setContasPoupancas(Set<ContaPoupança> contasPoupancas) {
        this.contasPoupancas = contasPoupancas;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
