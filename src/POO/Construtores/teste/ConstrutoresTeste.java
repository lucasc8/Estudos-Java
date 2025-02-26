package POO.Construtores.teste;

import POO.Construtores.dominio.Construtores;

public class ConstrutoresTeste {
    public static void main(String[] args) {
        Construtores pessoa1 = new Construtores("Ichigo", 18,'M');
        System.out.println("-------------------");
        System.out.println("primeira impressão c1");
        pessoa1.impressora();

        System.out.println("-------------------");
        System.out.println("segunda impressão c2");
        Construtores pessoa2 = new Construtores("sasuke", 16, 'M', "2004","brasileiro" );
        pessoa2.impressora();







    }

}
