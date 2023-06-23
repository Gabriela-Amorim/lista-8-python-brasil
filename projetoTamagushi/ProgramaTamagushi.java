package projetoTamagushi;

public class ProgramaTamagushi {
    public static void main(String[] args) {
        
        Tamagushi bichinho = new Tamagushi("Tamagushi", 30, 70, 3);

        System.out.println("Nome: " + bichinho.retornarNome());
        System.out.println("Fome: " + bichinho.retornarFome());
        System.out.println("Saúde: " + bichinho.retornarSaude());
        System.out.println("Idade: " + bichinho.retornarIdade());
        System.out.println("Humor: " + bichinho.retornarHumor());
    }

}
