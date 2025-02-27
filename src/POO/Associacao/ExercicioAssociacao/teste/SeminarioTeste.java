package POO.Associacao.ExercicioAssociacao.teste;

import POO.Associacao.ExercicioAssociacao.dominio.Aluno;
import POO.Associacao.ExercicioAssociacao.dominio.Local;
import POO.Associacao.ExercicioAssociacao.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local1 = new Local("Noronha");
        Seminario seminario1 = new Seminario(local1, "Redes de Computadores");
        Aluno aluno1 = new Aluno("jao",19);
        Aluno aluno2 = new Aluno("pedro", 19);
        Aluno[] alunos = {aluno1, aluno2};
        seminario1.setAluno(alunos);
        seminario1.imprime();




    }
}
