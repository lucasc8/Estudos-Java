package POO.Heranca.dominio;

public class Funcionario extends Pessoa{
    private int rg;

    public void imprimir(){
        super.imprimir();
        System.out.println("codigo 2");
    }


    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Lucas");
        System.out.println(funcionario1.getNome());
        System.out.println("------------");

        funcionario1.imprimir();



    }



}
