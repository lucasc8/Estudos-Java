package POO.IntroducaoClasses.Exercicio1Classes.teste;

import POO.IntroducaoClasses.Exercicio1Classes.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.Modelo = "Peugeot";
        carro1.Ano = 2002;
        carro1.Nome = "Mcqueen";

        Carro carro2 = new Carro();
        carro2.Modelo = "Sandero";
        carro2.Ano = 2004;
        carro2.Nome = "Mate";

        System.out.println("----------------");
        System.out.println(carro1.Modelo);
        System.out.println(carro1.Ano);
        System.out.println(carro1.Nome);
        System.out.println("----------------");

        System.out.println(carro2.Modelo);
        System.out.println(carro2.Ano);
        System.out.println(carro2.Nome);
        System.out.println("----------------");
    }
}
