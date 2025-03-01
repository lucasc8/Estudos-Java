package POO.ClassesAbstratas.teste;

import POO.ClassesAbstratas.dominio.Desenvolvedor;
import POO.ClassesAbstratas.dominio.Funcionario;
import POO.ClassesAbstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        //Funcionario funcionario1 = new Funcionario("a",100);
        Gerente gerente1 = new Gerente("Nami",100);
        //System.out.println(funcionario1);
        System.out.println(gerente1);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("scott",300);
        System.out.println(desenvolvedor1);

    }
}
