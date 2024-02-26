public class Programa {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Una", "Rua Paulistano, 123", "MG");
        System.out.println("Nome da universidade: " + universidade.getNome());
        System.out.println("Endereço da universidade: " + universidade.getEndereco());
        System.out.println("UF: " + universidade.getUf());
        System.out.println("CNPJ: " + universidade.getCnpj());

        Professor professor = new Professor("Daniel Paiva", 18, 987654321, 2, "Programação");

        System.out.println("\nNome do professor: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("CPF do professor: " + professor.getCpf());
        System.out.println("ID do professor: " + professor.getId());
        System.out.println("Matéria do professor: " + professor.getMateria());

        Aluno aluno = new Aluno("wesley", 26, 123456789, 1, 3);

        System.out.println("\nNome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("CPF do aluno: " + aluno.getCpf());
        System.out.println("ID do aluno: " + aluno.getId());
        System.out.println("Semestre do aluno: " + aluno.getSemestre());

        Disciplina disciplina = new Disciplina("Programação", 10, aluno, 0, 20, 0);
        disciplina.lancarPresenca(1, aluno.getId());
        disciplina.acertos(disciplina.getQuestoes(), disciplina.getErro());
    }
}

