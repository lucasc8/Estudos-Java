package POO.Heranca.dominio;

public class Pessoa {
    private String nome;
    private int cpf;
    private String endereco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void imprimir(){
        System.out.println("codigo 1");
    }
}
