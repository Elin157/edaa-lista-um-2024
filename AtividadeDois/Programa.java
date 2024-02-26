public class Programa{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wesley",30, "12312312");
        System.out.println("Os dados são: ");
        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println("A idade é: "+ pessoa.getIdade());
        System.out.println("O CPF é "+ pessoa.getCpf());
    }
}