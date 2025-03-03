package POO.Heranca.dominio;

public class Funcionario extends Pessoa{
    private int rg;
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
