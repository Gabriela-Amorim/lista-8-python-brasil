package projetoFazenda.application;

import java.util.ArrayList;
import java.util.List;

import projetoFazenda.entities.Fazenda;

public class Program {

    public static void main(String[] args) {

        List<Fazenda> fazenda = new ArrayList<>();

        fazenda.add(new Fazenda("Vaca"));
        fazenda.add(new Fazenda("Cavalo"));
        fazenda.add(new Fazenda("Pato"));

        System.out.println(fazenda);

        System.out.println("\nAlimentando.. (fome - 2)");
        for (Fazenda animais : fazenda) {
            animais.alimentar();
        }

        System.out.println(fazenda);

        System.out.println("\nBrincando.. (tedio - 2)");
        for (Fazenda animais : fazenda) {
            animais.brincar();
        }

        System.out.println(fazenda);

        System.out.println("\nOuvindo.. (tedio - 1)");
        for (Fazenda animais : fazenda) {
            animais.ouvir();
        }

        System.out.println(fazenda);

    }

}
