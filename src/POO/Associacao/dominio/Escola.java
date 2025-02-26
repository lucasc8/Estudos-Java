package POO.Associacao.dominio;


public class Escola {
    private String nome;
    private Professor[] professores;


    public void imprimir(){
        System.out.println(this.nome);
        if (professores == null){
            return;
        }
        else {
            for (Professor professor: professores){
                System.out.println(professor.getNome());
            }
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this(nome);
        this.professores = professores;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
