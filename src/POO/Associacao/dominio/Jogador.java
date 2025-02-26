package POO.Associacao.dominio;

public class Jogador {
    private String nome;
    private int idade;
    public Time time;

    @Override
    public String toString() {
        return nome; // Imprime apenas o nome do jogador
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.time);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
