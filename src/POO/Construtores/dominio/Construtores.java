package POO.Construtores.dominio;

public class Construtores {
    private String nome;
    private int idade;
    private char sexo;
    private String ano;
    private String nacionalidade;

    public Construtores(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Construtores(String nome, int idade, char sexo, String ano, String nacionalide){
        this(nome,idade,sexo);
        this.ano = ano;
        this.nacionalidade = nacionalide;
    }

    public void impressora() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.ano);
        System.out.println(this.nacionalidade);
    }
}
