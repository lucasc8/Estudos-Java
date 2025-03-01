package POO.ModificadorFinal.dominio;

public class Carro {
    public String nome;
    public static final double VELOCIDADE_LIMITE = 300;
    public final Comprador COMPRADOR = new Comprador();
    //private static final int VELOCIDADE_MAXIMA = 300;
    // final normlamente vem acompanhado de static
    // final -> constante
    // não pode ter mais de uma instancia
    // ex carro1.COMPRADOR = COMPRADOR2;

    public Carro(String nome) {
        this.nome = nome;
    }

    public final void imprimir(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
