package POO.IntroducaoMetodos.test;

import POO.IntroducaoMetodos.Exercicio1Metodos.dominio.CalculadoraMedia;
import POO.IntroducaoMetodos.Exercicio1Metodos.dominio.Funcionario;

public class FuncionarioTeste1 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        CalculadoraMedia calculadora = new CalculadoraMedia();

        funcionario1.nome = "Joao";
        funcionario1.idade = 36;
        funcionario1.salario = 1500;

        funcionario2.nome = "Akira";
        funcionario2.idade = 24;
        funcionario2.salario = 400;

        funcionario3.nome = "Toriyama";
        funcionario3.idade = 47;
        funcionario3.salario = 800;

        funcionario1.imprimir();
        funcionario2.imprimir();
        funcionario3.imprimir();

        // System.out.println(funcionario1.mediaSalarios(1500,400,800));

        calculadora.Media(funcionario1,funcionario2,funcionario3);
    }
}
