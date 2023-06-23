package projetoFuncionarioAprimorado;

public class FuncionarioAprimorado {
    private String nome;
    private double salario;

    public FuncionarioAprimorado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentualDeAumento) {
        double aumento = salario * (porcentualDeAumento / 100);
        salario += aumento;
    }
}