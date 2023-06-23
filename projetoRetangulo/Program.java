package projetoRetangulo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento do local: ");
        double comprimento = sc.nextDouble();
        System.out.print("Informe a largura do local: ");
        double largura = sc.nextDouble();

        Retangulo local = new Retangulo(comprimento, largura);

        System.out.println("Area do local " + local.Area());

        System.out.println("Informe a medida do piso: ");
        double medidaPiso = sc.nextDouble();

        System.out.println("Informe a medida do rodapé: ");
        double medidaRodape = sc.nextDouble();

        double areaLocal = local.Area();
        double areaPiso = medidaPiso * medidaPiso;
        double areaRodape = medidaRodape * medidaRodape;

        int quantidadePisos = (int) (areaLocal / areaPiso);
        int quantidadeRodapes = (int) (local.Perimetro() / areaRodape);

        System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

        sc.close();
        
    }

}
