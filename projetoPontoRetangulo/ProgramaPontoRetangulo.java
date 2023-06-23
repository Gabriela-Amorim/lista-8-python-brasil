package projetoPontoRetangulo;

import java.util.Scanner;

public class ProgramaPontoRetangulo {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Ponto pontoInicial1 = new Ponto(0, 0);
        Retangulo retangulo1 = new Retangulo(pontoInicial1, 5, 3);
        
        Ponto pontoInicial2 = new Ponto(2, 4);
        Retangulo retangulo2 = new Retangulo(pontoInicial2, 7, 2);
        
        int opcao;
        
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Imprimir valores do Retângulo 1");
            System.out.println("2. Imprimir valores do Retângulo 2");
            System.out.println("3. Alterar valores do Retângulo 1");
            System.out.println("4. Alterar valores do Retângulo 2");
            System.out.println("5. Imprimir centro do Retângulo 1");
            System.out.println("6. Imprimir centro do Retângulo 2");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nRetângulo 1:");
                    System.out.println("Ponto inicial: (" + retangulo1.getPontoInicial().getX() + ", " + retangulo1.getPontoInicial().getY() + ")");
                    System.out.println("Largura: " + retangulo1.getLargura());
                    System.out.println("Altura: " + retangulo1.getAltura());
                    break;
                case 2:
                    System.out.println("\nRetângulo 2:");
                    System.out.println("Ponto inicial: (" + retangulo2.getPontoInicial().getX() + ", " + retangulo2.getPontoInicial().getY() + ")");
                    System.out.println("Largura: " + retangulo2.getLargura());
                    System.out.println("Altura: " + retangulo2.getAltura());
                    break;
                case 3:
                    System.out.print("\nDigite a largura do Retângulo 1: ");
                    int largura1 = sc.nextInt();
                    System.out.print("Digite a altura do Retângulo 1: ");
                    int altura1 = sc.nextInt();
                    retangulo1.alterarValores(largura1, altura1);
                    break;
                case 4:
                    System.out.print("\nDigite a largura do Retângulo 2: ");
                    int largura2 = sc.nextInt();
                    System.out.print("Digite a altura do Retângulo 2: ");
                    int altura2 = sc.nextInt();
                    retangulo2.alterarValores(largura2, altura2);
                    break;
                case 5:
                    retangulo1.imprimirCentro();
                    break;
                case 6:
                    retangulo2.imprimirCentro();
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 0);
        
        sc.close();
    }
}
