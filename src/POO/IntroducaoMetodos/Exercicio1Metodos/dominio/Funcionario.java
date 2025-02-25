package POO.IntroducaoMetodos.Exercicio1Metodos.dominio;

public class Funcionario {
    //crie uma classe funcionario com os seguintes atributos
    //nome idade salario  // tres salarios devem ser guardados
    //crie dois metodos
    //1. imrimir dados
    //2. para tirar a media dos salarios e imprimir

    public String nome;
    public int idade;
    public int salario;

    public void imprimir(){
        System.out.println("-------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        System.out.println("-------------------------");
    }

    public double mediaSalarios(int salario1, int salario2, int salario3){
        System.out.println("-------------------------");
        System.out.println("calculadora1");
        return (salario1+salario2+salario3)/3;
    }
}
