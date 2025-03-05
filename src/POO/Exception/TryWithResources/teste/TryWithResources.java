package POO.Exception.TryWithResources.teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {

    public static void lerArquivo(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){
        }
        catch(IOException e){

        }

    }


    public static void main(String[] args) {

    }
}
