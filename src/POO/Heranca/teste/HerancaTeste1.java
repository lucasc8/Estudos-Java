package POO.Heranca.teste;

import POO.Heranca.dominio.Funcionario;

public class HerancaTeste1 {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao");

        System.out.println(funcionario1.getNome());
        System.out.println("------------");
        funcionario1.imprimir();


        int[] val = {1,2,3};
        String[] animals = {"zebra", "cachorro","gato"};
        System.out.println("--");

        for (String pegar:animals){
            System.out.println(pegar);
        }

        for (int vai: val){
            System.out.println(vai);
        }
        System.out.println("tostring-------------");

        System.out.println(funcionario1.toString());






    }
}
