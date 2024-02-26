public class LojaLivros{
   public static void main(String[] args) {
   Livro livro = new Livro("Harry Potter", "J.K. Rowling", "263", "Rocco");
      System.out.println("As informações do livro são: ");
   System.out.println("Título: " + livro.getTitulo());
   System.out.println("Autor: "+ livro.getAutor());
   System.out.println("Numero de Paginas: "+ livro.getNumeroPaginas());
   System.out.println("Editora: "+ livro.getEditora());
   }
}