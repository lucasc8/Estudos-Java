package POO.Associacao.ExercicioAssociacao.dominio;


import java.util.Arrays;

public class Seminario {
    private Aluno[] aluno;
    private Local local;
    private String titulo;



    public Seminario( Local local, String titulo){
        this.local = local;
        this.titulo = titulo;
    }
    public void imprime(){
        System.out.println(this.titulo);
        System.out.println(local.getNome());
        for (Aluno alunos : aluno){
            System.out.println(alunos.getNome());
        }




    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
