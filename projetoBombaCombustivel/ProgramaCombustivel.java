package projetoBombaCombustivel;

import java.util.Scanner;

public class ProgramaCombustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.0, 100.0);

        int opcao = 0;
        
        while (opcao != 6) {
            System.out.println("Menu:");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor do litro");
            System.out.println("4. Alterar tipo de combustível");
            System.out.println("5. Alterar quantidade de combustível na bomba");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser abastecido: R$");
                    double valorAbastecimento = sc.nextDouble();
                    bomba.abastecerPorValor(valorAbastecimento);
                    break;
                case 2:
                    System.out.print("Digite a quantidade em litros a ser abastecida: ");
                    double litrosAbastecimento = sc.nextDouble();
                    bomba.abastecerPorLitro(litrosAbastecimento);
                    break;
                case 3:
                    System.out.print("Digite o novo valor do litro: R$");
                    double novoValor = sc.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Digite o novo tipo de combustível: ");
                    String novoCombustivel = sc.next();
                    bomba.alterarCombustivel(novoCombustivel);
                    break;
                case 5:
                    System.out.print("Digite a nova quantidade de combustível na bomba: ");
                    double novaQuantidade = sc.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        sc.close();
    }
}
