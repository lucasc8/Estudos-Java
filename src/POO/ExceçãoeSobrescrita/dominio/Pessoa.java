package POO.ExceçãoeSobrescrita.dominio;

import POO.Exception.ExceçãoPersonalizada.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando pessoa");
    }
}
