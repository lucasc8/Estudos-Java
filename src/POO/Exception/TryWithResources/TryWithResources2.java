package POO.Exception.TryWithResources;

import POO.Exception.TryWithResources.dominio.Leitor1;
import POO.Exception.TryWithResources.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources2 {
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
                Leitor2 leitor2 = new Leitor2()){
        }
        catch(IOException e){

        }
    }
    public static void main(String[] args) {
        lerArquivo();
    }
}
