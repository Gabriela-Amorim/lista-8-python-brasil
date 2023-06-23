package projetoTamagushiPortaEscondida;

import java.util.Scanner;

public class ProgramaPortaEscondida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PortaEscondida bichinho = new PortaEscondida();

        System.out.println("Bem-vindo ao Bichinho Virtual!");
        System.out.println("==============================");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Ouvir");
            System.out.println("4 - Exibir estado");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    bichinho.alimentar();
                    break;
                case 2:
                    bichinho.brincar();
                    break;
                case 3:
                    bichinho.emitirSom();
                    break;
                case 4:
                    System.out.println(bichinho);
                    break;
                case 42: // Opção secreta
                    System.out.println("Porta escondida:");
                    System.out.println(bichinho.toStringDetalhado());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println("==============================");
        }

        System.out.println("Obrigado por brincar com o Bichinho Virtual!");

        sc.close();
    }
}
