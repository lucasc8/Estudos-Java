package inicio.pacote;

public class Exercicio3Switch {
    public static void main(String[] args) {
        int dia = 3;
        switch(dia) {
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda");
            break;
            case 3: System.out.println("Terça");
            break;
            case 4: System.out.println("Quinta");
            break;
            case 5: System.out.println("Sexta");
            break;
            case 6: System.out.println("Sábado");
            break;
            case 7: System.out.println("Domingo");
            break;
            default: System.out.println("Opção não válida");
                break;
        }
    }
}
