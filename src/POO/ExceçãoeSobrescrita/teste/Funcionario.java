package POO.ExceçãoeSobrescrita.teste;

import POO.Exception.ExceçãoPersonalizada.LoginInvalidoException;
import POO.ExceçãoeSobrescrita.dominio.Pessoa;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionario");
    }

}
