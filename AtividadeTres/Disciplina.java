import java.text.MessageFormat;

public class Disciplina {
    private String nome;
    private int presenca;
    private Aluno aluno;
    private double nota;
    private int questoes;
    private int erro;
    public Disciplina(String nome, int presenca, Aluno aluno, double nota, int questoes, int erro) {
        this.nome = nome;
        this.presenca = presenca;
        this.aluno = aluno;
        this.nota = nota;
        this.questoes = questoes;
        this.erro = erro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPresenca() {
        return presenca;
    }
    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }
    public int getQuestoes() {
        return questoes;
    }
    public void setQuestoes(int questoes) {
        this.questoes = questoes;
    }
    public int getErro() {
        return erro;
    }
    public void setErro(int erro) {
        this.erro = erro;
    }
    public Disciplina(String nome, int presenca, int questoes, int erro) {
        this.nome = nome;
        this.presenca = presenca;
        this.questoes = questoes;
        this.erro = erro;
    }
    public double getNota() {
        return nota;
    }
    public double acertos(int questoes, int erro) {
        nota = questoes - erro;
        System.out.println("A nota é: " + nota);
        return nota;
    }
    public void lancarPresenca(int presenca, int nome){
        presenca = nome;
        System.out.println(MessageFormat.format("O aluno {0}tem presença", aluno.getNome()));
    }
}
