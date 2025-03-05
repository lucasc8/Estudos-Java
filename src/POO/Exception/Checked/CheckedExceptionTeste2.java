package POO.Exception.Checked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste2 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste1.txt");

        file.createNewFile();
        System.out.println("Arquivo criado");



    }
}
