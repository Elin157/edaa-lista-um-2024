public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private int id;
    public Pessoa(String nome, int idade, int cpf, int id) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
