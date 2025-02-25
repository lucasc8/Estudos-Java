package POO.SobrecargaMetodos.teste;

import POO.SobrecargaMetodos.dominio.Desenho;

public class DesenhoTeste {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho();
        Desenho desenho2 = new Desenho();

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



    }
}
