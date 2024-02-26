public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(2, "domestico", "terrestre", "Trovão", "Caramelo", 3);
        System.out.println("O nome do Animal é: " +  cachorro.getNome());
        System.out.println("O Cachorro é um animal: " + cachorro.getTipo());
        System.out.println("O seu habitate é: " + cachorro.getHabitat());
        System.out.println("Sua Raça é: " + cachorro.getRaca());
        System.out.println("Sua Identificação é: " + cachorro.getId());
        cachorro.correr();
        
    }
}
