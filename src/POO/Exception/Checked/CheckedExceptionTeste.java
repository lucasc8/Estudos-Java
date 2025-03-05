package POO.Exception.Checked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    // checked, acontece na compilação

    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste1.txt");
        //--> tenta isso
        // se der Exception, pega
        try{
            file.createNewFile();   // -> java força a tratar
            System.out.println("Arquivo criado");
        }catch(IOException e){
            e.printStackTrace(); // nunca deixe o bloo em branco!!!!!!!
        }





    }


}
