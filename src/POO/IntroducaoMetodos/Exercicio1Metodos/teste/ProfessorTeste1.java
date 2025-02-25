package POO.IntroducaoMetodos.Exercicio1Metodos.teste;

import POO.IntroducaoMetodos.domain.Professor;

public class ProfessorTeste1 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "pedro";
        professor1.sexo = 'F';
        professor1.idade = 12;
        professor1.imprime();
    }
}
