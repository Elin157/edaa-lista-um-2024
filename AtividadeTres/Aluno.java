public class Aluno extends Pessoa{
    private int semestre;

    public Aluno(String nome, int idade, int cpf, int id, int semestre) {
        super(nome, idade, cpf, id);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}