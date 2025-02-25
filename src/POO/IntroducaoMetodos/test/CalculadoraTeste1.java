package POO.IntroducaoMetodos.test;

import POO.IntroducaoMetodos.domain.Calculadora;

public class CalculadoraTeste1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        calculadora.multiplica(10,8);

        double divisao = calculadora.divide(12,5);
        System.out.println(divisao);

        int[] array1 = {1,4,6,9};
        calculadora.somaArray(array1);

        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);






    }
}
