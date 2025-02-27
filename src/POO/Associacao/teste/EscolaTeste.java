package POO.Associacao.teste;

import POO.Associacao.dominio.Escola;
import POO.Associacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Maria Firmina");
        Professor professor1 = new Professor("Lucas");
        Professor[] professores = {professor1};

        escola1.setProfessores(professores);
        escola1.imprimir();




    }
}
