package POO.ModificadoresEstaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 270;

    public Carro (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }






}
