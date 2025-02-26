package POO.SobrecargaMetodos.teste;

import POO.SobrecargaMetodos.dominio.Desenho;

public class DesenhoTeste {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho("Dragon Ball");
        Desenho desenho2 = new Desenho("Naruto");

        desenho1.setNome("naruto");
        desenho1.setEps(300);

        int epsdesenho1 = desenho1.getEps();
        System.out.println(epsdesenho1);
        String nomedesenho1 = desenho1.getNome();
        System.out.println(nomedesenho1);
        System.out.println("-----------------");

        desenho2.init("Dragon Ball", 537);
        desenho2.imprime();
        System.out.println("------------------");
        desenho2.init("Dragon Ball", 537,"Ação",789);
        desenho2.imprime();
        System.out.println("------------------");

        System.out.println("------------------");
        Desenho desenho3 = new Desenho("Thundercats");
        desenho3.imprime();


    }
}
