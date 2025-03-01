package POO.ClassesAbstratas.dominio;
//funcionario é um template -> não é concreto
// força as subclasses a terem aqueles  atributos//métodos
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaBonus(); // método abstrato

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
