package POO.ClassesAbstratas.dominio;

public class Gerente extends Funcionario{
    //gerente é um funcionario

    public Gerente(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
    }

    public void  calculaBonus(){
        this.salario = salario + salario*0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
