package POO.Polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.2;
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Tomate(String nome, double valor){
        super(nome,valor);
    }
    @Override
    public double calcularImposto(double valor) {
        System.out.println("calculando imposto do tomate");
        return this.valor * IMPOSTO;
    }
}
