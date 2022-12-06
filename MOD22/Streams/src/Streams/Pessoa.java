package Streams;

import java.util.List;

public class Pessoa {
    private String id;
    private String nome;
    private String nacionalidade;
    private Integer idade;

    public Pessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getNacionalidade(), pessoa.getIdade());
    };

    public Pessoa( String id,String nome,String nacionalidade, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public List populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1","Carlos","Brasil",18);
        Pessoa pessoa2 = new Pessoa("p2","Daniel","Luxemburgo",20);
        Pessoa pessoa3 = new Pessoa("p3","Augusto","México",25);
        Pessoa pessoa4 = new Pessoa("p4","Asdrúbal","Coruba", 56);
        Pessoa pessoa5 = new Pessoa("p5","Astolfo","Brasil", 85);
        Pessoa pessoa6 = new Pessoa("p6","Antoniolow","Brasil", 74);
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6);
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + "]";
    }

    

}
