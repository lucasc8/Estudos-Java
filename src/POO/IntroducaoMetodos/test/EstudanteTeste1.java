package POO.IntroducaoMetodos.test;

import POO.IntroducaoMetodos.domain.Estudante;
import POO.IntroducaoMetodos.domain.ImpressoraEstudantes;

public class EstudanteTeste1 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Lucas";
        estudante1.sexo = 'M';
        estudante1.idade = 10;

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Jao";
        estudante2.sexo = 'F';
        estudante2.idade = 20;

        System.out.println("-------------------");

        ImpressoraEstudantes impressora = new ImpressoraEstudantes();
        impressora.impressao(estudante1);
        impressora.impressao(estudante2);
    }
}
