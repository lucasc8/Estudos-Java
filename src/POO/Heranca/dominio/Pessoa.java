package POO.Heranca.dominio;

import jdk.jshell.EvalException;

public class Pessoa {
    public String nome;
    protected int cpf;
    protected String endereco;
    public String teste;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                '}';
    }
}
