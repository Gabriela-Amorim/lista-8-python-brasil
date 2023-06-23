package projetoTamagushiAprimorado;

import projetoTamagushi.Tamagushi;

public class ProgramaTamagushiAprimorado {
    public static void main(String[] args) {
        
        Tamagushi tamagushi = new Tamagushi("Fofinho", 70, 80, 2);

        System.out.println("Nome: " + tamagushi.getNome());
        System.out.println("Fome: " + tamagushi.getFome());
        System.out.println("Saúde: " + tamagushi.getSaude());
        System.out.println("Idade: " + tamagushi.getIdade());
        System.out.println("Humor: " + tamagushi.getHumor());

        tamagushi.alimentar(30);
        tamagushi.brincar(20);

        System.out.println("Fome: " + tamagushi.getFome());
        System.out.println("Saúde: " + tamagushi.getSaude());
        System.out.println("Humor: " + tamagushi.getHumor());
    }
}

