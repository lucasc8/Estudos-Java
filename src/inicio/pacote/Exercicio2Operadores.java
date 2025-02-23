package inicio.pacote;

public class Exercicio2Operadores {
    public static void main(String[] args) {
       //quanto eu teria que pagar de imposto na Olanda de acordo com meu salário anual
       // 0 - 34712 -> 9.70%  34713 - 68507 ->37,35%         68508 ->49.50%
        double salarioAnual = 34712;
        double pagar = 0;
        if (salarioAnual >= 0 && salarioAnual < 34712){
            pagar = 0.097 * salarioAnual;
        }
        else if (salarioAnual >=34712 && salarioAnual < 68508){
            pagar = 0.37 * salarioAnual;
        }
        else {
            pagar = 0.49 * salarioAnual;
        }
        String resultado = "De acordo com os cálculos feitos pelo banco, o senhor precisará pagar o valor de: " + pagar;
        System.out.println(resultado);
    }
}
