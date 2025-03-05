package POO.Exception.ExceçãoPersonalizada;

import POO.Exception.Checked.CheckedExceptionTeste;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String message) {
        super(message);
    }

    public LoginInvalidoException() {
        super("Login invalido");
    }
}
