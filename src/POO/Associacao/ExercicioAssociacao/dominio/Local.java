package POO.Associacao.ExercicioAssociacao.dominio;

public class Local {
    private String nome;

    public void imprimir(){
        System.out.println(this.nome);
    }

    public Local(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
