package POO.IntroducaoMetodos.ExercicioDevMg00.teste;

import POO.IntroducaoMetodos.ExercicioDevMg00.dominio.Calc1;

import java.util.Arrays;

public class CalcTeste {
    public static void main(String[] args) {
        Calc1 calculadora = new Calc1();

        double[] arrayValores = {1,4,5};
        double[] arrayResultado = calculadora.dobrarArray(arrayValores);
        System.out.println(arrayResultado.toString());
        System.out.println(Arrays.toString(arrayResultado));
    }
}
