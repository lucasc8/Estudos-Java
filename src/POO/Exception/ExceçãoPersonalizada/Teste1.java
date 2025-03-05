package POO.Exception.ExceçãoPersonalizada;

import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    public static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String username1 = "goku";
        String senhaDB = "super";
        System.out.println("Usuário");
        String user =  scanner.nextLine();
        if (user != username1){
            throw new LoginInvalidoException("Usuario ou senha");
        }
        System.out.println("Usuario Logado");
    }
}
