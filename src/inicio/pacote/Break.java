package inicio.pacote;

public class Break {
    //mostre os primeiros 25 numeros de 50.
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
