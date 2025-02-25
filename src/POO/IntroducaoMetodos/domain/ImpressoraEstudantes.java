package POO.IntroducaoMetodos.domain;

import POO.IntroducaoMetodos.test.EstudanteTeste1;

public class ImpressoraEstudantes {
    public void impressao(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }


}
