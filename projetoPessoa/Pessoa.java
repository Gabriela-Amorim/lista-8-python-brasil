package projetoPessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso; 
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }


    public void envelhecer() {
        this.idade++;

        if (this.idade < 21) {
            crescer(0.5);
        }
    }
    
    public void engordar(double pesoGanho) {
        this.peso += pesoGanho;
    }

    public void emagrecer(double pesoPerdido) {
        this.peso -= pesoPerdido;
    }

    public void crescer(double alturaGanha) {
        this.altura += alturaGanha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


}
