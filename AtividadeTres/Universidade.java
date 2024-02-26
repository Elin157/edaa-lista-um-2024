public class Universidade {
    private String nome;
    private String endereco;
    private final int cnpj = 123456789;
    private String uf;
    
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getCnpj() {
        return cnpj;
    }
    
    public Universidade(String nome, String endereco, String uf) {
        this.nome = nome;
        this.endereco = endereco;
        this.uf = uf;
    }
    
    public String novoEndereco(String novoEndereco) {
        endereco = novoEndereco;
        return endereco;
    }
}
    
