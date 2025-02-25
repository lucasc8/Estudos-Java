package POO.IntroducaoMetodos.ExercicioDevMg00.dominio;

public class CalcPrimo {
    // se o número for primo = true
    // se o numero não for primo = false
    // primo -> divisivel por 1 e ele mesmo

    public void calculoPrimo(double a){
        for (int i = 1; i <= a; i++) {
            if (i == 1){
                System.out.println("Inicio do codigo------");
            }
            if (a % i == 0 && i != a && i != 1){
                System.out.println("Começo do if 1");
                System.out.println("O número "+ a +" não é primo!");
                System.out.println("Fim do if 1");
                break;
            }
            if (i == a){
                System.out.println("Começo do if 2");
                System.out.println("O número " + a + " é primo!");
                System.out.println("Fim do código!");
            }
        }





    }



}
