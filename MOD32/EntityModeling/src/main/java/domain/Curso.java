package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CURSO")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //USING INSTEAD OF SEQUENCE - MAY CAUSE PROBLEMS ON INSERT STATEMENTS 
    private Long id;

    @Column(name = "CODIGO", length = 10, unique = true, nullable = false)
    private String codigo;
    
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "DESCRICAO", length = 140, nullable = false)
    private String descricao;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
