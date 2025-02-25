package POO.SobrecargaMetodos.dominio;

public class Desenho {
    public String nome;
    public int eps;
    public int faixaetaria;
    public String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFaixaetaria() {
        return faixaetaria;
    }

    public void setFaixaetaria(int faixaetaria) {
        this.faixaetaria = faixaetaria;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.eps);
        System.out.println(this.genero);
        System.out.println(this.faixaetaria);
    }

    public void init(String nome, int eps){
        this.nome = nome;
        this.eps = eps;
    }

    public void init(String nome, int eps, String genero, int faixaetaria){
        this.init(nome,eps);
        this.genero = genero;
        this.faixaetaria = faixaetaria;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEps(int eps){
        this.eps = eps;
    }
    public String getNome(){
        return nome;
    }
    public int getEps(){
        return eps;
    }


}
