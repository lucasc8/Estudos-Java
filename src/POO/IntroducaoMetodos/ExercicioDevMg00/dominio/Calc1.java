package POO.IntroducaoMetodos.ExercicioDevMg00.dominio;

public class Calc1 {
    @Override
    public String toString() {
        return super.toString();
    }

    public static double[] dobrarArray(double[] arr){
        double[] arrayNovo = new double[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arrayNovo[i] = arr[i] * 2;
        }
        return arrayNovo;
    }
}
