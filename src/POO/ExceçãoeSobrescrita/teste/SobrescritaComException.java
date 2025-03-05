package POO.ExceçãoeSobrescrita.teste;

import POO.Exception.ExceçãoPersonalizada.LoginInvalidoException;
import POO.ExceçãoeSobrescrita.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException {
    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();


        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
        pessoa.salvar();

    }
}
