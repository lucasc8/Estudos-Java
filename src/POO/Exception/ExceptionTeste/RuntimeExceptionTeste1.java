package POO.Exception.ExceptionTeste;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTeste1 {
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste2.txt");
        //tenta executar essa linha// se falhar, catch o erro IOExeption// e executa essa linha
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: "+isCreated);
        }catch (IOException e){
            //nunca deixe esse bloco em branco, vc ignora a exceção e nao ta avisando pra ninguem
            //printa isso e continua basicamente (porém tem aviso)
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("inicio");
        criarNovoArquivo();
    }
}
