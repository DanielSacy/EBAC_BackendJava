package domain;

import java.time.Instant;

import javax.persistence.*;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matricula_seq")
    @SequenceGenerator(name = "matricula_seq", sequenceName = "sq_matricula", initialValue = 1, allocationSize = 1)
    private Long id;
    
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
    
    
    @Column(name = "DATA_MATRICULA", nullable = false)
    private Instant dataMatricula;

    @Column(name = "VALOR", nullable = false)
    private Double valor;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    public Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public enum Status {
        ATIVO,
        INATIVO
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
}
