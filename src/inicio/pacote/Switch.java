package inicio.pacote;

public class Switch {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 1: System.out.println("é");
            break;
            case 2: System.out.println("2");
            break;
            case 3: System.out.println("3");
            break;
            case 4: System.out.println("4");
            break;
            default: System.out.println("Opção Invalida");
            break;
        }
        int contador = 0;
        for (int count = 0; count < 3; count++){
            System.out.println("For");
        }
        do {
            System.out.println("Do");
            contador++;
        } while (contador == 0);
        while(contador < 5) {
            System.out.println(contador);
            contador++;
        }







    }
}
