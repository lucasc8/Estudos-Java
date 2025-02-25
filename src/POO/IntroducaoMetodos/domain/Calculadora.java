package POO.IntroducaoMetodos.domain;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println("x + y");
    }

    public void multiplica(int x, int y){
        System.out.println(x * y);
    }

    public double divide(double x, double y){
        return x/y;
    }

    public void somaArray(int[] array){
        int soma = 0;
        for (int num : array){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
