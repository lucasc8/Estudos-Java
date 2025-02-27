package POO.Associacao.ExercicioAssociacao.dominio;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(Seminario[] seminarios, String nome, String especialidade) {
        this.seminarios = seminarios;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.seminarios);
        System.out.println(this.especialidade);
    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
