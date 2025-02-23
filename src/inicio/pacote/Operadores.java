package inicio.pacote;

public class Operadores {
    public static void main(String[] args) {
        /* - + * / % (resto)
        && !!
        ≤ ≥ > < == ≠  ! = */

        boolean eounao = 10 < 38 && 5 <10;
        if (eounao == true){
            System.out.println("True");
        }
        boolean eousim = 10 != 3 | 10 > 1;
        if (eousim == false){
            System.out.println("False");
        }
        int idade = 17;
        if(idade > 10){
            System.out.println("PreAdolescente");
        }
        else if(idade >= 10 && idade < 18){
            System.out.println("Adolescente");
        }
        else{
            System.out.println("Você é rapaizinho já ;D");
        }
        String mensagemDoar = "vou doar 500";
        String mensagemNaoDoar = "nao vou doar";
        double salario = 300;
        String resultado = salario >= 500 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}