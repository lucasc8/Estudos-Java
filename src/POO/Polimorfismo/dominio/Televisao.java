package POO.Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.4;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto(double valor) {
        System.out.println("Cauculando imposto da televisão");
        return this.valor*IMPOSTO;
    }
}
