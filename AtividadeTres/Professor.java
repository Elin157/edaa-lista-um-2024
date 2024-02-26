public class Professor extends Pessoa{
    private String materia;

    public Professor(String nome, int idade, int cpf, int id, String materia) {
        super(nome, idade, cpf, id);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
