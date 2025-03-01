package POO.Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.4;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto(double valor) {
        System.out.println("calculando imposto do computador");
        return this.valor * IMPOSTO;
    }
}
