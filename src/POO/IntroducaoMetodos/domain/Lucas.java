package POO.IntroducaoMetodos.domain;

public class Lucas {
    public String nome;
    private int idade;
    private char sexo;

    public void imprimirNome(Lucas lucas){
        System.out.println(lucas.nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getName(){
        return this.nome;
    }

}
