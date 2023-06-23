package projetoPessoa;

public class Programa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", 20, 70.0, 170.0);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " cm");

        pessoa.envelhecer();
        pessoa.engordar(2.5);
        pessoa.emagrecer(1.0);
        pessoa.crescer(1.0);

        System.out.println("\nApós envelhecer, engordar, emagrecer e crescer:");
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " cm");
    }
}
    

